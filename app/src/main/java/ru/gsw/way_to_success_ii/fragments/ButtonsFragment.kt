package ru.gsw.way_to_success_ii.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_buttons.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions


class ButtonsFragment (gameActivity: GameActivity, name: String, background: Int): Fragment() {

    private val _gameActivity = gameActivity
    private val _name = name
    private val _background = background

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)
        view.textView.text = _name
        view.background_image.setImageResource(_background)

        GameButtonsActions(_gameActivity).generateButtons(view.buttons_fragment_main_layout, _name )

        return view
    }
}