package ru.gsw.way_to_success_ii.gameButtons

import android.animation.ObjectAnimator
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnEnd
import androidx.core.view.forEach
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_game.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.constatns.Constants

class WindowsButtons (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun one() {
        hidingWindowsButton()
    }
    fun two() {
        hidingWindowsButton()
    }
    fun three() {
        hidingWindowsButton()
    }
    fun four() {
        hidingWindowsButton()
    }
    fun five() {
        hidingWindowsButton()
    }

    fun hidingWindowsButton() {
        val windowButtons = _gameActivity.layout_game_windows_buttons
        val anim = ObjectAnimator.ofFloat(_gameActivity.layout_game_windows_buttons, "translationY", 0f)
        anim.doOnEnd { endAnimation(windowButtons) }
        anim.duration = Constants.durationAnimationWindowButtons
        anim.start()
    }

    private fun endAnimation(windowButtons: View){
        StateButtons.openedButtons = false
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        buttonsGroup.forEach { activateButton(it) }

        if(StateButtons.showAfterHiding){
            SectionsButtons(_gameActivity).showingWindowsButton()
            StateButtons.showAfterHiding = false
        }
    }

    private fun activateButton(button: View){
        button.visibility = View.INVISIBLE;
    }
}