package ru.gsw.way_to_success_ii.windowsMoney

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_game.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

class WindowsMoney (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    init {
        WindowsMoneyState.windowRubles = _gameActivity.layout_game_windows_money.findViewById(R.id.layout_rubles)
        WindowsMoneyState.windowDollars = _gameActivity.layout_game_windows_money.findViewById(R.id.layout_dollars)
        WindowsMoneyState.windowsArray.add(WindowsMoneyState.windowRubles)
        WindowsMoneyState.windowsArray.add(WindowsMoneyState.windowDollars)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun windowsMoneyClick(){
        WindowsMoneyState.windowsArray.forEach {
            it.setOnClickListener{
                WindowsMoneyActions().showingWindows()
            }
        }
    }

}