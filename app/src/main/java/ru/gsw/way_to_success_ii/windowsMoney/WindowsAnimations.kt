package ru.gsw.way_to_success_ii.windowsMoney

import android.annotation.SuppressLint
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.status_bars.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.main.MainActions

class WindowsAnimations (mainActions: MainActions, gameActivity: GameActivity,  bar: String, from: Float, to: Float): Animation() {

//    private val _mainActions = mainActions
//    private val _gameActivity = gameActivity
//    private val _bar = bar
//
//    private var _from = from
//    private var _to = to
//
//    @SuppressLint("SetTextI18n")
//    override fun applyTransformation(interpolatedTime: Float, transformation: Transformation){
//        super.applyTransformation(interpolatedTime, transformation)
//        val value: Float = _from + (_to - _from) * interpolatedTime
//
//        when(_bar){
//            "days" -> _mainActions.setHealthBar(value.toInt())
////            "rubles" -> WindowsMoneyActions().setMoney(_gameActivity)  _statusBarsAction.setMoodBar(value.toInt())
////            "dollars" -> _statusBarsAction.setFoodBar(value.toInt())
//        }
//
//    }
//

}