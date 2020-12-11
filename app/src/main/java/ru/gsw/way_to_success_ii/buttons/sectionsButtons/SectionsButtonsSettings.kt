package ru.gsw.way_to_success_ii.buttons.sectionsButtons

import android.content.Intent
import kotlinx.android.synthetic.main.windows_buttons.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.MainActivity
import ru.gsw.way_to_success_ii.fragments.ChangeFragments

class SectionsButtonsSettings (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun character(){
        SectionsButtonsState.buttonPressed = "character"
        _gameActivity.button_game_windows_one.setOnClickListener { characteristics() }
        _gameActivity.button_game_windows_two.setOnClickListener { environment() }
        _gameActivity.button_game_windows_three.setOnClickListener { tree() }
        _gameActivity.button_game_windows_four.setOnClickListener { achievements() }
        _gameActivity.button_game_windows_five.setOnClickListener { exit() }
    }
    fun needs(){
        SectionsButtonsState.buttonPressed = "needs"
        _gameActivity.button_game_windows_one.setOnClickListener { food() }
        _gameActivity.button_game_windows_two.setOnClickListener { mood() }
        _gameActivity.button_game_windows_three.setOnClickListener { health() }

    }
    fun work(){
        SectionsButtonsState.buttonPressed = "work"
        _gameActivity.button_game_windows_one.setOnClickListener { hobbies() }
        _gameActivity.button_game_windows_two.setOnClickListener { freelance() }
        _gameActivity.button_game_windows_three.setOnClickListener { legalwork() }
        _gameActivity.button_game_windows_four.setOnClickListener { unlegalwork() }
        _gameActivity.button_game_windows_five.setOnClickListener { business() }
    }
    fun quality(){
        SectionsButtonsState.buttonPressed = "quality"
        _gameActivity.button_game_windows_one.setOnClickListener { education() }
        _gameActivity.button_game_windows_two.setOnClickListener { property() }
        _gameActivity.button_game_windows_three.setOnClickListener { immovables() }
        _gameActivity.button_game_windows_four.setOnClickListener { corruption() }
    }
    fun establishments(){
        SectionsButtonsState.buttonPressed = "establishments"
        _gameActivity.button_game_windows_one.setOnClickListener { bank() }
        _gameActivity.button_game_windows_two.setOnClickListener { exchange() }
    }

    fun characteristics(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("characteristics")
    }

    fun environment(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("environment")
    }

    fun achievements(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("achievements")
    }

    fun tree(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("tree")
    }

    fun exit(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        val intent = Intent(_gameActivity, MainActivity::class.java)
        _gameActivity.startActivity(intent)
    }

    fun food(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("food")
    }

    fun health(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("health")
    }

    fun mood(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("mood")
    }

    fun hobbies(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("hobbies")
    }
    fun freelance(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("freelance")
    }

    fun legalwork(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("legalwork")
    }

    fun unlegalwork(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("unlegalwork")
    }

    fun business(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("business")
    }

    fun education(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("education")
    }

    fun property(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("property")
    }

    fun immovables(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("immovables")
    }

    fun corruption(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("corruption")
    }

    fun bank(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("bank")
    }

    fun exchange(){
        SectionsButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("exchange")
    }


}