package ru.gsw.way_to_success_ii.windowsMoney

import android.animation.ObjectAnimator
import android.os.Build
import android.view.View
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import ru.gsw.way_to_success_ii.constatns.Constants

class WindowsMoneyActions {

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

    fun hidingWindows(){
        WindowsMoneyState.windowsArray.forEachIndexed{ index, element
            ->
            transformWindows(element, 0f)
            element.setOnClickListener{
                WindowsMoneyActions().showingWindows()
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

}