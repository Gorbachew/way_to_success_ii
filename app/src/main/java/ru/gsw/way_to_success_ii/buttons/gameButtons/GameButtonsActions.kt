package ru.gsw.way_to_success_ii.buttons.gameButtons

import android.annotation.SuppressLint
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.game_button.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars


class GameButtonsActions(private val gameActivity: GameActivity) {

    @SuppressLint("SetTextI18n", "ClickableViewAccessibility")
    fun addButton(layout: LinearLayout, id: Int, name: String){

        val gameButton = gameActivity.layoutInflater.inflate(R.layout.game_button, layout, false)

        val params = gameButton.layoutParams as ViewGroup.MarginLayoutParams
        params.setMargins(0, 30, 0, 0)
        gameButton.layoutParams = params

        val gameButtonParameters = GameButtonsSettings(gameActivity).getParameters(name)
        gameButton.game_button_name.text = gameButtonParameters.title
        gameButton.game_button_price.text = gameButtonParameters.price.toString()
        gameButton.id = id
        gameButton.setOnTouchListener { _, event -> onTouch(event, gameButton, gameButtonParameters) }
        layout.addView(gameButton)
    }

    private fun onTouch(event: MotionEvent, gameButton: View, gameButtonParameters: GameButtonParameters): Boolean{
        when(event.action){
            0 -> {
                gameButton.game_button_border.setBackgroundColor(gameActivity.resources.getColor(R.color.color_button_border_pressed))
                gameButton.isPressed = true
            }
            1 -> {
                MainVars.isDrag = false
                if(MainVars.isDrag) return true
                gameButtonParameters.onClick()
                MainActions(gameActivity).nextMove()
                disableButton(gameButton)
            }
            2 -> {
                MainVars.isDrag = true
                disableButton(gameButton)
            }
            3-> {
                disableButton(gameButton)
            }
        }
        return true
    }

    private fun disableButton(gameButton: View){
        gameButton.isPressed = false
        gameButton.game_button_border.setBackgroundColor(gameActivity.resources.getColor(R.color.color_button_border))
    }

}