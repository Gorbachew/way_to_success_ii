package ru.gsw.way_to_success_ii.windowsMoney

import android.widget.LinearLayout

object WindowsMoneyState {

    lateinit var windowRubles: LinearLayout
    lateinit var windowDollars: LinearLayout
    var mainWindow: Int = 0
    var windowsArray = mutableListOf<LinearLayout>()
}