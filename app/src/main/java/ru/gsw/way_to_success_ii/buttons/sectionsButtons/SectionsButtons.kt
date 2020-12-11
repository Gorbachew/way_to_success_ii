package ru.gsw.way_to_success_ii.buttons.sectionsButtons

import kotlinx.android.synthetic.main.sections_buttons.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.constatns.Constants


class SectionsButtons (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun sectionsButtonsClick() {
        _gameActivity.button_game_sections_character.setOnClickListener{ SectionsButtons(_gameActivity).character() }
        _gameActivity.button_game_sections_needs.setOnClickListener { SectionsButtons(_gameActivity).needs() }
        _gameActivity.button_game_sections_work.setOnClickListener { SectionsButtons(_gameActivity).work() }
        _gameActivity.button_game_sections_quality.setOnClickListener { SectionsButtons(_gameActivity).quality()  }
        _gameActivity.button_game_sections_establishments.setOnClickListener { SectionsButtons(_gameActivity).establishments() }
        SectionsButtonActions(_gameActivity).hiddingWindowsButtons()
    }

    private fun character(){
        SectionsButtonsState.howMuchShow = Constants.character_quantity_buttons
        SectionsButtonsSettings(_gameActivity).character()
        forAllButtons()
    }
    private fun needs(){
        SectionsButtonsState.howMuchShow = Constants.needs_quantity_buttons
        SectionsButtonsSettings(_gameActivity).needs()
        forAllButtons()
    }
    private fun work(){
        SectionsButtonsState.howMuchShow = Constants.work_quantity_buttons
        SectionsButtonsSettings(_gameActivity).work()
        forAllButtons()
    }
    private fun quality(){
        SectionsButtonsState.howMuchShow = Constants.quality_quantity_buttons
        SectionsButtonsSettings(_gameActivity).quality()
        forAllButtons()
    }
    private fun establishments(){
        SectionsButtonsState.howMuchShow = Constants.establishments_quantity_buttons
        SectionsButtonsSettings(_gameActivity).establishments()
        forAllButtons()
    }

    private fun forAllButtons(){
        checkOpened()
    }

    private fun checkOpened(){
        if(!SectionsButtonsState.openedButtons){
            SectionsButtonActions(_gameActivity).showingWindowsButton()
        }else{
            SectionsButtonsState.showAfterHiding = true
            SectionsButtonActions(_gameActivity).hidingWindowsButton()
        }
    }
}