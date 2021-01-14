package ru.gsw.way_to_success_ii.main

import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions

class MainActions(gameActivity: GameActivity) {

    val _gameActivity = gameActivity

    fun nextMove(){
        val from = MainVars.days
        MainVars.days += Constants.days_per_move.getValue(MainVars.act)
        MainVars.year_days += Constants.days_per_move.getValue(MainVars.act)
        WindowsMoneyActions().displayAnimationText(_gameActivity.text_days, _gameActivity, "days", from, MainVars.days )

        checkHappyBirthday()
    }

    fun changeRubles( sign: Char, value: Long ){
        val from = MainVars.rubles.toInt()
        when(sign){
            '+' -> { MainVars.rubles += value }
            '-' -> { MainVars.rubles -= value }
            '=' -> { MainVars.rubles = value }
        }
        WindowsMoneyActions().setMoney(_gameActivity)
        WindowsMoneyActions().displayAnimationText(_gameActivity.text_rubles, _gameActivity, "rubles", from, MainVars.rubles.toInt() )

    }

    fun changeDollars( sign: Char, value: Long ){
        val from = MainVars.dollars.toInt()
        when(sign){
            '+' -> { MainVars.dollars += value }
            '-' -> { MainVars.dollars -= value }
            '=' -> { MainVars.dollars = value }
        }
        WindowsMoneyActions().displayAnimationText(_gameActivity.text_dollars, _gameActivity, "dollars", from, MainVars.dollars.toInt() )
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