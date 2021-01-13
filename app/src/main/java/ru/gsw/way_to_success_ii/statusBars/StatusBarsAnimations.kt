package ru.gsw.way_to_success_ii.statusBars

import android.annotation.SuppressLint
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.status_bars.*
import ru.gsw.way_to_success_ii.GameActivity

class StatusBarsAnimations (statusBarsAction: StatusBarsAction, statusBar: String, from: Float, to: Float): Animation() {

    private val _statusBarsAction = statusBarsAction
    private val _statusBar = statusBar

    private var _from = from
    private var _to = to

    @SuppressLint("SetTextI18n")
    override fun applyTransformation(interpolatedTime: Float, transformation: Transformation){
        super.applyTransformation(interpolatedTime, transformation)
        val value: Float = _from + (_to - _from) * interpolatedTime

        when(_statusBar){
            "health" -> _statusBarsAction.setHealthBar(value.toInt())
            "mood" -> _statusBarsAction.setMoodBar(value.toInt())
            "food" -> _statusBarsAction.setFoodBar(value.toInt())
        }

    }


}