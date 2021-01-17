package ru.gsw.way_to_success_ii

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import ru.gsw.way_to_success_ii.main.MainVars
import ru.gsw.way_to_success_ii.options.Options
import ru.gsw.way_to_success_ii.saveSystem.UserDatabase

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Options().setStatusBarColor(this)

        buttonsClick()
        MainVars.db = createDb()
    }

    private fun buttonsClick() {
        button_main_start_game.setOnClickListener{
            val intent = Intent(this, ChoiceCharacterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun createDb(): UserDatabase{
        return Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java, "user-database"
        ).fallbackToDestructiveMigration().build()
    }
}