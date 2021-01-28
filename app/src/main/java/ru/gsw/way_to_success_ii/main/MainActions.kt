package ru.gsw.way_to_success_ii.main

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.fragment_buttons.buttons_fragment_main_layout
import kotlinx.android.synthetic.main.fragment_buttons.view.*
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.saveSystem.MainSaveSystem
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions
import java.io.Console

class MainActions(private val gameActivity: GameActivity) {

    @SuppressLint("ShowToast")
    fun initializeToast(){
        MainVars.toast = Toast.makeText(gameActivity, gameActivity.getString(R.string.button_plug), Toast.LENGTH_LONG)
    }

    @SuppressLint("ShowToast")
    fun toast(value: String){
        MainVars.toast.cancel()
        MainVars.toast = Toast.makeText(gameActivity, value, Toast.LENGTH_LONG)
        MainVars.toast.show()
    }

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

    fun updateButton(){
        if(MainVars.activeFragment == "buttonsFragment"){
            gameActivity.buttons_fragment_main_layout.removeAllViews()
            Constants.buttons.getValue(MainVars.currentWindow).getValue(MainVars.act).forEachIndexed { index, s ->
                GameButtonsActions(gameActivity).addButton(gameActivity.buttons_fragment_main_layout, index, s)
            }
        }
    }

    fun checkAct(){
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

    private fun checkHappyBirthday(){
        if(MainVars.year_days >= 365){
            MainVars.year_days -= 365
            MainVars.age += 1
            checkAct()
        }
    }


}