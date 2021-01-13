package ru.gsw.way_to_success_ii.saveSystem

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction
import ru.gsw.way_to_success_ii.main.MainVars
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyState

class MainSaveSystem (gameActivity: GameActivity){

    val _gameActivity = gameActivity

    fun loadMain(){
        MainVars.max_health = 100
        MainVars.health = 0
        MainVars.max_mood = 100
        MainVars.mood = 0
        MainVars.max_food = 100
        MainVars.food = 0

        MainVars.first_name = "Maxim"
        MainVars.last_name = "Gorbachev"
        MainVars.sex = "Боевой вертолет"

        MainVars.respect = 0
        MainVars.rubles = 1
        MainVars.dollars = 2

        MainVars.age = 0
        MainVars.days = 0
        MainVars.year_days = 0

        MainVars.force = 1
        MainVars.intelligence = 2
        MainVars.attractiveness = 3
        MainVars.adaptability = 4
        MainVars.creativity = 5
        MainVars.cheating = 6
        MainVars.luck = 7
        MainVars.hard_work = 8
        MainVars.enterprise = 9

        setStatusBars(_gameActivity)
        WindowsMoneyActions().setMoney(_gameActivity)
        MainActions(_gameActivity).displayDays()
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