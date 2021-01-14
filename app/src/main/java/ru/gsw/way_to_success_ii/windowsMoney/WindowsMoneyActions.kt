package ru.gsw.way_to_success_ii.windowsMoney

import android.animation.ObjectAnimator
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.main.MainVars

class WindowsMoneyActions {

    fun setMoney(gameActivity: GameActivity){
        gameActivity.text_rubles.text = MainVars.rubles.toString()
        gameActivity.text_dollars.text = MainVars.dollars.toString()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun showingWindows(){
        var margin = 0f
        WindowsMoneyState.windowsArray.forEachIndexed{ index, element
            ->
            transformWindows(element, margin)
            element.z = 1f
            element.setOnClickListener{
                WindowsMoneyActions().hidingWindows()
                WindowsMoneyState.mainWindow = index
                it.z = 2f
            }
            margin += 70f
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun hidingWindows(){
        WindowsMoneyState.windowsArray.forEachIndexed{ index, element
            ->
            transformWindows(element, 0f)
            element.setOnClickListener{
                showingWindows()
            }
        }
    }

    private fun transformWindows(window: View, value: Float){
        val anim = ObjectAnimator.ofFloat(window, "translationY", value)
        anim.duration = Constants.duration_animation_window_buttons
        anim.start()
    }

    private fun changeFirstWindow(){
        WindowsMoneyState.windowsArray.add(WindowsMoneyState.windowsArray[WindowsMoneyState.mainWindow])
        WindowsMoneyState.windowsArray.removeAt(WindowsMoneyState.mainWindow + 1)
    }

    fun displayAnimationText(view: View, gameActivity: GameActivity, statusBar: String, from: Int, to: Int){
        val windowsAnimations =
            WindowsAnimations(
                gameActivity,
                statusBar,
                from.toFloat(),
                to.toFloat()
            )
        windowsAnimations.duration = Constants.duration_animation_status_bars
        view.startAnimation(windowsAnimations)
    }

}