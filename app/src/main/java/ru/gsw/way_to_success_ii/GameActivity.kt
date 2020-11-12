package ru.gsw.way_to_success_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gsw.way_to_success_ii.gameButtons.GameButtons

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        GameButtons().sectionsButtonsClick(this)
        GameButtons().windowsButtonsClick(this)

    }

}