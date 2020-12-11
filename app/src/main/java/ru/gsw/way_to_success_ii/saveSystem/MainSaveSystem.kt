package ru.gsw.way_to_success_ii.saveSystem

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction
import ru.gsw.way_to_success_ii.main.MainVars

class MainSaveSystem (gameActivity: GameActivity){

    val _gameActivity = gameActivity

    fun loadMain(){
        MainVars.max_health = 100
        MainVars.health = 0
        MainVars.max_mood = 100
        MainVars.mood = 0
        MainVars.max_food = 100
        MainVars.food = 0

        MainVars.respect = 0

        MainVars.rubles = 0
        MainVars.dollars = 0

        setStatusBars(_gameActivity)
    }

    private fun setStatusBars(gameActivity: GameActivity){
        StatusBarsAction(gameActivity).setMoodBar(MainVars.health)
        StatusBarsAction(gameActivity).setHealthBar(MainVars.mood)
        StatusBarsAction(gameActivity).setFoodBar(MainVars.food)
        StatusBarsAction(gameActivity).setMaxMoodBar(MainVars.max_mood)
        StatusBarsAction(gameActivity).setMaxHealthBar(MainVars.max_health)
        StatusBarsAction(gameActivity).setMaxFoodBar(MainVars.max_food)

    }

}