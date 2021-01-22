package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars

class GameButtonsChecks(private val gameActivity: GameActivity) {

    fun rubles(value: Long): Boolean{
        if(MainVars.rubles >= value){
            MainActions(gameActivity).changeRubles('-', value)
            return true
        }
        MainActions(gameActivity).toast(gameActivity.resources.getString(R.string.check_no_rubles))
        return false
    }

    fun dollars(value: Long): Boolean{
        if(MainVars.dollars >= value){
            return true
        }
        MainActions(gameActivity).toast(gameActivity.resources.getString(R.string.check_no_dollars))
        return false
    }
}