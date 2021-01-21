package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction

class GameButtonsSettingsFood (private val gameActivity: GameActivity) {

    fun drinkMilk(){
        StatusBarsAction(gameActivity).changeFoodBar(10, '+')
    }

    fun eatSoup(){
        StatusBarsAction(gameActivity).changeFoodBar(10, '+')
        MainActions(gameActivity).changeRubles('-', 10)
    }

    fun eatCanteen(){
        StatusBarsAction(gameActivity).changeFoodBar(10, '+')
        MainActions(gameActivity).changeRubles('-', 30)
    }

    fun eatGarbage(){
        StatusBarsAction(gameActivity).changeFoodBar(10, '+')
        MainActions(gameActivity).changeRubles('-', 50)
    }

}