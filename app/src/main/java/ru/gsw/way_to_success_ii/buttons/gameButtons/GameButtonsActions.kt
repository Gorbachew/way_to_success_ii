package ru.gsw.way_to_success_ii.buttons.gameButtons

import android.annotation.SuppressLint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.game_button.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.constatns.Constants
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars


class GameButtonsActions(private val gameActivity: GameActivity) {

    fun generateButtons(layout: LinearLayout, fragment: String){

        when(fragment){
            "characteristics" -> {
            }
            "environment" -> {
            }
            "achievements" -> {
            }
            "tree" -> {
            }

            "food" -> {
                when (MainVars.act) {
                    "baby" -> Constants.game_buttons_food_Baby.forEachIndexed { index, s ->
                        addButton(layout, index, s)
                    }
                    "child" -> Constants.game_buttons_food_child.forEachIndexed { index, s ->
                        addButton(layout, index, s)
                    }
                    "youth" -> Constants.game_buttons_food_youth.forEachIndexed { index, s ->
                        addButton(layout, index, s)
                    }
                    "adult" -> Constants.game_buttons_food_adult.forEachIndexed { index, s ->
                        addButton(layout, index, s)
                    }
                    "old" -> Constants.game_buttons_food_old.forEachIndexed { index, s ->
                        addButton(layout, index, s)
                    }
                }

            }
            "health" -> {
            }
            "mood" -> {
            }

            "hobbies" -> {
            }
            "freelance" -> {
            }
            "legalwork" -> {
            }
            "unlegalwork" -> {
            }
            "business" -> {
            }

            "education" -> {
            }
            "property" -> {
            }
            "immovables" -> {
            }
            "corruption" -> {
            }

            "exchange" -> {
            }
            "bank" -> {
            }
        }

    }

    @SuppressLint("SetTextI18n", "ClickableViewAccessibility")
    private fun addButton(layout: LinearLayout, id: Int, name: String){

        val gameButton = gameActivity.layoutInflater.inflate(R.layout.game_button, layout, false)

        gameButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        val gameButtonParameters = GameButtonsSettings(gameActivity).getParameters(name)
        gameButton.game_button_name.text = gameButtonParameters.title
        gameButton.game_button_price.text = gameButtonParameters.price.toString()
        gameButton.id = id
        gameButton.setOnTouchListener { _, event -> onTouch(event, gameButton, gameButtonParameters) }
        layout.addView(gameButton)
    }

    private fun onTouch(event: MotionEvent, gameButton: View, gameButtonParameters: GameButtonParameters): Boolean{
        if(event.action == 0){
            gameButtonParameters.onClick()
            gameButton.game_button_border.setBackgroundColor(gameActivity.resources.getColor(R.color.color_button_border_pressed))
            gameButton.isPressed = true
            MainActions(gameActivity).nextMove()
        }
        else if(event.action == 1) {
            gameButton.game_button_border.setBackgroundColor(gameActivity.resources.getColor(R.color.color_button_border))
            gameButton.isPressed = false
        }
        return true
    }


}