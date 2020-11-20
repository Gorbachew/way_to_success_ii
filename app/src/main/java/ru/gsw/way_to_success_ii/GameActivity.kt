package ru.gsw.way_to_success_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gsw.way_to_success_ii.fragments.ChangeFragments
import ru.gsw.way_to_success_ii.gameButtons.SectionsButtons

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        SectionsButtons(this).sectionsButtonsClick()

        ChangeFragments(this).connectFragments()
    }


}