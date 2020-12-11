package ru.gsw.way_to_success_ii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gsw.way_to_success_ii.fragments.ChangeFragments
import ru.gsw.way_to_success_ii.buttons.sectionsButtons.SectionsButtons
import ru.gsw.way_to_success_ii.saveSystem.MainSaveSystem
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoney

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        SectionsButtons(this).sectionsButtonsClick()
        WindowsMoney(this).windowsMoneyClick()
        ChangeFragments(this).connectFragments()
        MainSaveSystem(this).loadMain()
    }
}