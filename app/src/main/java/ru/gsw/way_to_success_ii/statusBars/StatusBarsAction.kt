package ru.gsw.way_to_success_ii.statusBars

import android.annotation.SuppressLint
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.status_bars.*
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.main.MainVars
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions

class StatusBarsAction (gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    @SuppressLint("SetTextI18n")
    fun changeHealthBar(value: Int, sign: Char){
        val from = MainVars.health
        when(sign){
            '+' -> MainVars.health += value
            '-' -> MainVars.health -= value
        }
        checkValueHealth()
        WindowsMoneyActions().displayAnimationText(_gameActivity.status_bar_food, _gameActivity, "health", from, MainVars.health )

    }

    @SuppressLint("SetTextI18n")
    fun changeMoodBar(value: Int, sign: Char){
        val from = MainVars.mood
        when(sign){
            '+' -> MainVars.mood += value
            '-' -> MainVars.mood -= value
        }
        checkValueMood()
        WindowsMoneyActions().displayAnimationText(_gameActivity.status_bar_food, _gameActivity, "mood", from, MainVars.mood )
    }

    @SuppressLint("SetTextI18n")
    fun changeFoodBar(value: Int, sign: Char){
        val from = MainVars.food
        when(sign){
            '+' -> MainVars.food += value
            '-' -> MainVars.food -= value
        }
        checkValueFood()
        WindowsMoneyActions().displayAnimationText(_gameActivity.status_bar_food, _gameActivity, "food", from, MainVars.food )
    }

    @SuppressLint("SetTextI18n")
    fun setHealthBar(value: Int){
        MainVars.health = value
        _gameActivity.status_bar_health.progress = MainVars.health
        _gameActivity.status_bar_health_percent.text = MainVars.health.toString() + "/" + MainVars.max_health.toString()
    }

    @SuppressLint("SetTextI18n")
    fun setMoodBar(value: Int){
        MainVars.mood = value
        _gameActivity.status_bar_mood.progress = MainVars.mood
        _gameActivity.status_bar_mood_percent.text = MainVars.mood.toString() + "/" + MainVars.max_mood.toString()
    }

    @SuppressLint("SetTextI18n")
    fun setFoodBar(value: Int){
        MainVars.food = value
        _gameActivity.status_bar_food.progress = MainVars.food
        _gameActivity.status_bar_food_percent.text = MainVars.food.toString() + "/" + MainVars.max_food.toString()
    }

    @SuppressLint("SetTextI18n")
    fun setMaxHealthBar(value: Int){
        MainVars.max_food = value
        _gameActivity.status_bar_health.progress = MainVars.health
        _gameActivity.status_bar_health_percent.text = MainVars.health.toString() + "/" + MainVars.max_health.toString()
    }

    @SuppressLint("SetTextI18n")
    fun setMaxMoodBar(value: Int){
        MainVars.max_food = value
        _gameActivity.status_bar_mood.progress = MainVars.mood
        _gameActivity.status_bar_mood_percent.text = MainVars.mood.toString() + "/" + MainVars.max_mood.toString()
    }

    @SuppressLint("SetTextI18n")
    fun setMaxFoodBar(value: Int){
        MainVars.max_food = value
        _gameActivity.status_bar_food.progress = MainVars.food
        _gameActivity.status_bar_food_percent.text = MainVars.food.toString() + "/" + MainVars.max_food.toString()
    }

    private fun checkValueFood(){
        if(MainVars.food > MainVars.max_food){
            MainVars.food = MainVars.max_food
        }else if(MainVars.food < 0){
            MainVars.food = 0
        }
    }

    private fun checkValueHealth(){
        if(MainVars.health > MainVars.max_health){
            MainVars.health = MainVars.max_health
        }else if(MainVars.health < 0){
            MainVars.health = 0
        }
    }

    private fun checkValueMood(){
        if(MainVars.mood > MainVars.max_mood){
            MainVars.mood = MainVars.max_mood
        }else if(MainVars.mood < 0){
            MainVars.mood = 0
        }
    }
}