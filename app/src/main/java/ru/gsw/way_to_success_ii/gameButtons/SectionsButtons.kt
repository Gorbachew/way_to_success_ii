package ru.gsw.way_to_success_ii.gameButtons

import android.animation.ObjectAnimator
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.doOnStart
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_game.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.constatns.Constants


class SectionsButtons (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun character(){
        checkOpened()
        StateButtons.howMuchShow = Constants.characterQuantityButtons
    }
    fun needs(){
        checkOpened()
        StateButtons.howMuchShow = Constants.needsQuantityButtons
    }
    fun work(){
        checkOpened()
        StateButtons.howMuchShow = Constants.workQuantityButtons
    }
    fun quality(){
        checkOpened()
        StateButtons.howMuchShow = Constants.qualityQuantityButtons
    }
    fun establishments(){
        checkOpened()
        StateButtons.howMuchShow = Constants.establishmentsQuantityButtons
    }

    fun showingWindowsButton(){
        val windowButtons = _gameActivity.layout_game_windows_buttons
        val buttonsGroup: ViewGroup = windowButtons as ViewGroup
        for(i in 0 .. buttonsGroup.childCount){
            if(i == StateButtons.howMuchShow){
                break
            }
            activateButton(buttonsGroup[i])
        }

        val anim = ObjectAnimator.ofFloat(windowButtons, "translationY", -200f)
        anim.doOnStart { startAnimation() }
        anim.duration = Constants.durationAnimationWindowButtons
        anim.start()

    }

    private fun startAnimation(){
        StateButtons.openedButtons = true
    }

    private fun activateButton(button: View){
        button.visibility = View.VISIBLE;
    }

    private fun checkOpened(){
        if(!StateButtons.openedButtons){
            showingWindowsButton()
        }else{
            StateButtons.showAfterHiding = true
            WindowsButtons(_gameActivity).hidingWindowsButton()
        }
    }
}