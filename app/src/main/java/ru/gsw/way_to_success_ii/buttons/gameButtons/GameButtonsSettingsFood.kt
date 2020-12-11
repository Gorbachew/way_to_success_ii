package ru.gsw.way_to_success_ii.buttons.gameButtons

import android.widget.Toast
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction

class GameButtonsSettingsFood (gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    //baby
    fun drink_milk(){
        StatusBarsAction(_gameActivity).changeFoodBar(10, '+')
        Toast.makeText(_gameActivity, "drink_milk", Toast.LENGTH_LONG).show()
    }

}