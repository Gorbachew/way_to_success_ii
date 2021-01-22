package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

class GameButtonsSettings (private val gameActivity: GameActivity) {

    fun getParameters(name: String): GameButtonParameters{
        val gbp = GameButtonParameters()
        when(name){
            "drink_milk" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_drink_milk)
                gbp.price = 100
                gbp.onClick = { GameButtonsSettingsFood(gameActivity).drinkMilk(gbp.price) }
            }
            "eat_soup" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_eat_soup)
                gbp.price = 10
                gbp.onClick = { GameButtonsSettingsFood(gameActivity).eatSoup() }
            }
            "eat_canteen" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_eat_canteen)
                gbp.price = 30
                gbp.onClick = { GameButtonsSettingsFood(gameActivity).eatCanteen() }
            }
            "eat_digging_garbage" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_digging_garbage)
                gbp.price = 50
                gbp.onClick = { GameButtonsSettingsFood(gameActivity).eatGarbage() }
            }
        }
        return gbp

    }

}