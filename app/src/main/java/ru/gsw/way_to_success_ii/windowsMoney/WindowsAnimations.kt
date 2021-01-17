package ru.gsw.way_to_success_ii.windowsMoney

import android.annotation.SuppressLint
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.status_bars.*
import kotlinx.android.synthetic.main.windows_money.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction

class WindowsAnimations (gameActivity: GameActivity,  obj_name: String, from: Float, to: Float): Animation() {

    private val _gameActivity = gameActivity
    private val _obj_name = obj_name

    private var _from = from
    private var _to = to

    @SuppressLint("SetTextI18n")
    override fun applyTransformation(interpolatedTime: Float, transformation: Transformation){
        super.applyTransformation(interpolatedTime, transformation)
        val value: Float = _from + (_to - _from) * interpolatedTime

        when(_obj_name){
            "days" -> _gameActivity.text_days.text = value.toInt().toString()
            "rubles" -> _gameActivity.text_rubles.text = value.toInt().toString()
            "dollars" -> _gameActivity.text_dollars.text = value.toInt().toString()

            "health" -> StatusBarsAction(_gameActivity).setHealthBar(value.toInt())
            "mood" -> StatusBarsAction(_gameActivity).setMoodBar(value.toInt())
            "satiety" -> StatusBarsAction(_gameActivity).setSatietyBar(value.toInt())
        }
    }


}