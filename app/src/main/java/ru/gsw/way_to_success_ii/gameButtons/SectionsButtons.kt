package ru.gsw.way_to_success_ii.gameButtons

import android.animation.ObjectAnimator
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnStart
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_game.*
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
        ButtonActions(_gameActivity).disabledWindowsButtons()
    }

    private fun character(){
        StateButtons.howMuchShow = Constants.characterQuantityButtons
        SettingsButtons(_gameActivity).character()
        forAllButtons()
    }
    private fun needs(){
        StateButtons.howMuchShow = Constants.needsQuantityButtons
        SettingsButtons(_gameActivity).needs()
        forAllButtons()
    }
    private fun work(){
        StateButtons.howMuchShow = Constants.workQuantityButtons
        SettingsButtons(_gameActivity).work()
        forAllButtons()
    }
    private fun quality(){
        StateButtons.howMuchShow = Constants.qualityQuantityButtons
        SettingsButtons(_gameActivity).quality()
        forAllButtons()
    }
    private fun establishments(){
        StateButtons.howMuchShow = Constants.establishmentsQuantityButtons
        SettingsButtons(_gameActivity).establishments()
        forAllButtons()
    }

    private fun forAllButtons(){
        checkOpened()
    }

    private fun checkOpened(){
        if(!StateButtons.openedButtons){
            ButtonActions(_gameActivity).showingWindowsButton()
        }else{
            StateButtons.showAfterHiding = true
            ButtonActions(_gameActivity).hidingWindowsButton()
        }
    }
}