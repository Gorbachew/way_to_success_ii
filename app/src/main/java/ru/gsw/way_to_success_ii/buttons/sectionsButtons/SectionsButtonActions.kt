package ru.gsw.way_to_success_ii.buttons.sectionsButtons

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.core.view.forEach
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.sections_buttons.*
import kotlinx.android.synthetic.main.windows_buttons.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.main.MainVars

class SectionsButtonActions(private val gameActivity: GameActivity) {

    fun hidingWindowsButton() {

        val anim = ObjectAnimator.ofFloat(gameActivity.layout_game_windows_buttons, "translationY", 0f)
        anim.doOnEnd { endAnimation() }
        anim.duration = Constants.duration_animation_window_buttons
        anim.start()
    }

    fun showingWindowsButton(){
        val windowButtons = gameActivity.layout_game_windows_buttons
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        for(i in 0 .. buttonsGroup.childCount){
            if(i == SectionsButtonsState.howMuchShow){
                break
            }
            activateButton(buttonsGroup[i], true)
        }

        val anim = ObjectAnimator.ofFloat(windowButtons, "translationY", -190f)
        anim.doOnStart { startAnimation() }
        anim.duration = Constants.duration_animation_window_buttons
        anim.start()

    }

    fun hiddingWindowsButtons(){
        val windowButtons = gameActivity.layout_game_windows_buttons
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        buttonsGroup.forEach { activateButton(it, false) }
    }


    fun enableButtons(section: String){

        gameActivity.button_game_sections_character.isEnabled = true
        gameActivity.button_game_sections_needs.isEnabled = true
        gameActivity.button_game_sections_work.isEnabled = true
        gameActivity.button_game_sections_quality.isEnabled = true
        gameActivity.button_game_sections_establishments.isEnabled = true
        gameActivity.button_game_windows_one.isEnabled = true
        gameActivity.button_game_windows_two.isEnabled = true
        gameActivity.button_game_windows_three.isEnabled = true
        gameActivity.button_game_windows_four.isEnabled = true
        gameActivity.button_game_windows_five.isEnabled = true

        when(MainVars.act){
            "baby" ->{
                if(section == "work"){
                    gameActivity.button_game_windows_two.isEnabled = false
                    gameActivity.button_game_windows_three.isEnabled = false
                    gameActivity.button_game_windows_four.isEnabled = false
                    gameActivity.button_game_windows_five.isEnabled = false
                }
                gameActivity.button_game_sections_quality.isEnabled = false
                gameActivity.button_game_sections_establishments.isEnabled = false
            }
            "child" ->{
                if(section == "work"){
                    gameActivity.button_game_windows_three.isEnabled = false
                    gameActivity.button_game_windows_four.isEnabled = false
                    gameActivity.button_game_windows_five.isEnabled = false
                }
                gameActivity.button_game_sections_establishments.isEnabled = false
            }
        }
    }

    private fun endAnimation(){
        SectionsButtonsState.openedButtons = false

        enableButtons(SectionsButtonsState.buttonPressed)

        hiddingWindowsButtons()

        if(SectionsButtonsState.showAfterHiding){
            showingWindowsButton()
            SectionsButtonsState.showAfterHiding = false
        }
    }

    private fun startAnimation(){
        enableButtons(SectionsButtonsState.buttonPressed)
        SectionsButtonsState.openedButtons = true
        changeIcons(SectionsButtonsState.buttonPressed)
    }

    private fun activateButton(button: View, isVisible: Boolean){
        if(isVisible){
            button.visibility = View.VISIBLE
        }else{
            button.visibility = View.INVISIBLE
        }

    }

    private fun changeIcons(section: String){

        when(section){
            "character" -> {
                gameActivity.button_game_sections_character.isEnabled = false
                gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_characteristics)
                gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_environment)
                gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_tree)
                gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_achievements)
                gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_menu_exit)
            }
            "needs" -> {
                gameActivity.button_game_sections_needs.isEnabled = false
                gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_food)
                gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_mood)
                gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_hearth)
            }
            "work" -> {
                gameActivity.button_game_sections_work.isEnabled = false
                gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_hobbies)
                gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_freelance)
                gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_legalwork)
                gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_unlegalwork)
                gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_windows_business)
            }
            "quality" -> {
                gameActivity.button_game_sections_quality.isEnabled = false
                gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_education)
                gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_property)
                gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_immovables)
                gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_corruption)
                gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_windows_child)
            }
            "establishments" -> {
                gameActivity.button_game_sections_establishments.isEnabled = false
                gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_bank)
                gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_exchange)
                gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_tree)
            }
        }
    }


}