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
                gbp.onClick = { GameButtonsSettingsFood(_gameActivity).drinkMilk() }
            }
            "eat_soup" ->{
                gbp.title = _gameActivity.resources.getString(R.string.food_eat_soup)
                gbp.price = 10
                gbp.onClick = { GameButtonsSettingsFood(_gameActivity).eatSoup() }
            }
            "eat_canteen" ->{
                gbp.title = _gameActivity.resources.getString(R.string.food_eat_canteen)
                gbp.price = 30
                gbp.onClick = { GameButtonsSettingsFood(_gameActivity).eatCanteen() }
            }
            "eat_garbage" ->{
                gbp.title = _gameActivity.resources.getString(R.string.food_eat_garbage)
                gbp.price = 50
                gbp.onClick = { GameButtonsSettingsFood(_gameActivity).eatGarbage() }
            }
        }
        return gbp

    }

}