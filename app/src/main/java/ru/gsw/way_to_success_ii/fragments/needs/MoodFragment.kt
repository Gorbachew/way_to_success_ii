package ru.gsw.way_to_success_ii.fragments.needs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_mood.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.StatusBars.StatusBarsAction

class MoodFragment (gameActivity: GameActivity): Fragment() {

    private val _gameActivity = gameActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mood, container, false)

        view.fragment_mood_plus.setOnClickListener {
            StatusBarsAction(_gameActivity)
                .changeMoodBar(10, '+')
        }
        view.fragment_mood_minus.setOnClickListener {
            StatusBarsAction(_gameActivity)
                .changeMoodBar(10, '-')
        }

        return view
    }

}