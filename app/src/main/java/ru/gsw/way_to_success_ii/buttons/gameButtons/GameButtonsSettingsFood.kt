package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction

class GameButtonsSettingsFood (gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    fun drinkMilk(){
        StatusBarsAction(_gameActivity).changeFoodBar(10, '+')
    }

    fun eatSoup(){
        StatusBarsAction(_gameActivity).changeFoodBar(10, '+')
        MainActions(_gameActivity).changeRubles('-', 10)
    }

    fun eatCanteen(){
        StatusBarsAction(_gameActivity).changeFoodBar(10, '+')
        MainActions(_gameActivity).changeRubles('-', 30)
    }

    fun eatGarbage(){
        StatusBarsAction(_gameActivity).changeFoodBar(10, '+')
        MainActions(_gameActivity).changeRubles('-', 50)
    }

}