package ru.gsw.way_to_success_ii.gameButtons

import kotlinx.android.synthetic.main.sections_buttons.*
import kotlinx.android.synthetic.main.windows_buttons.*
import ru.gsw.way_to_success_ii.GameActivity


class GameButtons {

    fun sectionsButtonsClick(gameActivity: GameActivity) {
        gameActivity.button_game_sections_character.setOnClickListener{ SectionsButtons(gameActivity).character() }
        gameActivity.button_game_sections_needs.setOnClickListener { SectionsButtons(gameActivity).needs() }
        gameActivity.button_game_sections_work.setOnClickListener { SectionsButtons(gameActivity).work() }
        gameActivity.button_game_sections_quality.setOnClickListener { SectionsButtons(gameActivity).quality()  }
        gameActivity.button_game_sections_establishments.setOnClickListener { SectionsButtons(gameActivity).establishments() }
    }

    fun windowsButtonsClick(gameActivity: GameActivity){
        gameActivity.button_game_windows_one.setOnClickListener{ WindowsButtons(gameActivity).one() }
        gameActivity.button_game_windows_two.setOnClickListener{ WindowsButtons(gameActivity).two() }
        gameActivity.button_game_windows_three.setOnClickListener{ WindowsButtons(gameActivity).three() }
        gameActivity.button_game_windows_four.setOnClickListener{ WindowsButtons(gameActivity).four() }
        gameActivity.button_game_windows_five.setOnClickListener{ WindowsButtons(gameActivity).five() }
    }
}