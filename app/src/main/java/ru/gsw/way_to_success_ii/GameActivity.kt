package ru.gsw.way_to_success_ii

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_game.*
import ru.gsw.way_to_success_ii.fragments.ChangeFragments
import ru.gsw.way_to_success_ii.buttons.sectionsButtons.SectionsButtons
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars
import ru.gsw.way_to_success_ii.saveSystem.MainSaveSystem
import ru.gsw.way_to_success_ii.statusBars.StatusBarsAction
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoney
import ru.gsw.way_to_success_ii.windowsMoney.WindowsMoneyActions

class GameActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        SectionsButtons(this).sectionsButtonsClick()
        WindowsMoney(this).windowsMoneyClick()
        ChangeFragments(this).connectFragments()
        displayParams()
        MainActions(this).initializeToast()
    }

    private fun displayParams(){
        StatusBarsAction(this).setMoodBar(MainVars.health)
        StatusBarsAction(this).setHealthBar(MainVars.mood)
        StatusBarsAction(this).setSatietyBar(MainVars.satiety)
        StatusBarsAction(this).setMaxMoodBar(MainVars.max_mood)
        StatusBarsAction(this).setMaxHealthBar(MainVars.max_health)
        StatusBarsAction(this).setMaxSatietyBar(MainVars.max_satiety)
        WindowsMoneyActions().setMoney(this)
        WindowsMoneyActions().displayAnimationText(text_days, this, "days", 0, MainVars.days )
    }


}