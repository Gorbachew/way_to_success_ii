package ru.gsw.way_to_success_ii.fragments.needs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_health.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.StatusBars.StatusBarsAction


class HealthFragment (gameActivity: GameActivity): Fragment() {

    private val _gameActivity = gameActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_health, container, false)

        view.fragment_health_plus.setOnClickListener {
            StatusBarsAction(_gameActivity)
                .changeHealthBar(10, '+')
        }
        view.fragment_health_minus.setOnClickListener {
            StatusBarsAction(_gameActivity)
                .changeHealthBar(10, '-')
        }

        return view
    }

}