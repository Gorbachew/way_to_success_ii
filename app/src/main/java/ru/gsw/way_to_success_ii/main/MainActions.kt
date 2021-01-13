package ru.gsw.way_to_success_ii.main

import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.fragment_buttons.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.fragments.ButtonsFragment
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions

class MainActions(gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    fun displayDays(){
        _gameActivity.text_days.text = MainVars.days.toString()
    }

    fun nextMove(){
        MainVars.days += Constants.days_per_move.getValue(MainVars.act)
        MainVars.year_days += Constants.days_per_move.getValue(MainVars.act)
        displayDays()
        checkHappyBirthday()
    }

    fun changeRubles( sign: Char, value: Long ){
        when(sign){
            '+' -> { MainVars.rubles += value }
            '-' -> { MainVars.rubles -= value }
            '=' -> { MainVars.rubles = value }
        }
        WindowsMoneyActions().setMoney(_gameActivity)
    }

    fun changeDollars( sign: Char, value: Long ){
        when(sign){
            '+' -> { MainVars.dollars += value }
            '-' -> { MainVars.dollars -= value }
            '=' -> { MainVars.dollars = value }
        }
    }

    fun checkHappyBirthday(){
        if(MainVars.year_days >= 365){
            MainVars.year_days -= 365
            MainVars.age += 1
            checkAct()
        }
    }

    private fun checkAct(){
        if( MainVars.age >= 75){
            MainVars.act = "old"
            updateButton()
        }else if ( MainVars.age >= 18 ){
            MainVars.act = "adult"
            updateButton()
        }else if ( MainVars.age >= 12 ){
            MainVars.act = "youth"
            updateButton()
        }else if ( MainVars.age >= 3 ){
            MainVars.act = "child"
            updateButton()
        }
    }

    fun updateButton(){
        _gameActivity.buttons_fragment_main_layout.removeAllViews()
        GameButtonsActions(_gameActivity).generateButtons(_gameActivity.buttons_fragment_main_layout, MainVars.currentWindow)
    }

}