package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

class GameButtonsSettings (gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    fun getParameters(name: String): GameButtonParameters{

        val gbp = GameButtonParameters()
        when(name){
            "drink_milk" ->{
                gbp.title = _gameActivity.resources.getString(R.string.food_drink_milk)
                gbp.price = 0
                gbp.onClick = { GameButtonsSettingsFood(_gameActivity).drink_milk() }
            }
        }
        return gbp

    }

}