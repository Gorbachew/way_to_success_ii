package ru.gsw.way_to_success_ii.gameButtons

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

class ButtonActions(gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun hidingWindowsButton() {

        val anim = ObjectAnimator.ofFloat(_gameActivity.layout_game_windows_buttons, "translationY", 0f)
        anim.doOnEnd { endAnimation() }
        anim.duration = Constants.durationAnimationWindowButtons
        anim.start()
    }

    fun showingWindowsButton(){
        val windowButtons = _gameActivity.layout_game_windows_buttons
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        for(i in 0 .. buttonsGroup.childCount){
            if(i == StateButtons.howMuchShow){
                break
            }
            activateButton(buttonsGroup[i], true)
        }

        val anim = ObjectAnimator.ofFloat(windowButtons, "translationY", -190f)
        anim.doOnStart { startAnimation() }
        anim.duration = Constants.durationAnimationWindowButtons
        anim.start()

    }

    fun hiddingWindowsButtons(){
        val windowButtons = _gameActivity.layout_game_windows_buttons
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        buttonsGroup.forEach { activateButton(it, false) }
    }

    private fun endAnimation(){
        StateButtons.openedButtons = false

        enableButtons()

        hiddingWindowsButtons()

        if(StateButtons.showAfterHiding){
            showingWindowsButton()
            StateButtons.showAfterHiding = false
        }
    }

    private fun startAnimation(){
        StateButtons.openedButtons = true
        changeIcons(StateButtons.buttonPressed)
    }

    private fun activateButton(button: View, isVisible: Boolean){
        if(isVisible){
            button.visibility = View.VISIBLE
        }else{
            button.visibility = View.INVISIBLE
        }

    }

    private fun enableButtons(){
        _gameActivity.button_game_sections_character.isEnabled = true
        _gameActivity.button_game_sections_needs.isEnabled = true
        _gameActivity.button_game_sections_work.isEnabled = true
        _gameActivity.button_game_sections_quality.isEnabled = true
        _gameActivity.button_game_sections_establishments.isEnabled = true
    }

    private fun changeIcons(section: String){


        when(section){
            "character" -> {
                _gameActivity.button_game_sections_character.isEnabled = false
                _gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_characteristics)
                _gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_environment)
                _gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_tree)
                _gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_achievements)
                _gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_menu_exit)
            }
            "needs" -> {
                _gameActivity.button_game_sections_needs.isEnabled = false
                _gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_food)
                _gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_hearth)
                _gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_mood)
            }
            "work" -> {
                _gameActivity.button_game_sections_work.isEnabled = false
                _gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_hobbies)
                _gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_freelance)
                _gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_legalwork)
                _gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_unlegalwork)
                _gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_windows_business)
            }
            "quality" -> {
                _gameActivity.button_game_sections_quality.isEnabled = false
                _gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_education)
                _gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_property)
                _gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_immovables)
                _gameActivity.button_game_windows_four.setImageResource(R.drawable.icon_windows_corruption)
                _gameActivity.button_game_windows_five.setImageResource(R.drawable.icon_windows_child)
            }
            "establishments" -> {
                _gameActivity.button_game_sections_establishments.isEnabled = false
                _gameActivity.button_game_windows_one.setImageResource(R.drawable.icon_windows_bank)
                _gameActivity.button_game_windows_two.setImageResource(R.drawable.icon_windows_exchange)
                _gameActivity.button_game_windows_three.setImageResource(R.drawable.icon_windows_tree)
            }
        }
    }
}