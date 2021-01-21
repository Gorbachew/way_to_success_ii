package ru.gsw.way_to_success_ii.main

import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.saveSystem.MainSaveSystem
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions

class MainActions(private val gameActivity: GameActivity) {

    fun nextMove(){
        val from = MainVars.days
        MainVars.move++
        MainVars.days += Constants.days_per_move.getValue(MainVars.act)
        MainVars.year_days += Constants.days_per_move.getValue(MainVars.act)
        WindowsMoneyActions().displayAnimationText(gameActivity.text_days, gameActivity, "days", from, MainVars.days )

        checkHappyBirthday()

        MainSaveSystem().saveMain()
    }

    fun changeRubles( sign: Char, value: Long ){
        val from = MainVars.rubles.toInt()
        when(sign){
            '+' -> { MainVars.rubles += value }
            '-' -> { MainVars.rubles -= value }
            '=' -> { MainVars.rubles = value }
        }
        WindowsMoneyActions().setMoney(gameActivity)
        WindowsMoneyActions().displayAnimationText(gameActivity.text_rubles, gameActivity, "rubles", from, MainVars.rubles.toInt() )

    }

    fun changeDollars( sign: Char, value: Long ){
        val from = MainVars.dollars.toInt()
        when(sign){
            '+' -> { MainVars.dollars += value }
            '-' -> { MainVars.dollars -= value }
            '=' -> { MainVars.dollars = value }
        }
        WindowsMoneyActions().displayAnimationText(gameActivity.text_dollars, gameActivity, "dollars", from, MainVars.dollars.toInt() )
    }

    fun checkHappyBirthday(){
        if(MainVars.year_days >= 365){
            MainVars.year_days -= 365
            MainVars.age += 1
            checkAct()
        }
    }

    fun updateButton(){
        gameActivity.buttons_fragment_main_layout.removeAllViews()
        GameButtonsActions(gameActivity).generateButtons(gameActivity.buttons_fragment_main_layout, MainVars.currentWindow)
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
}