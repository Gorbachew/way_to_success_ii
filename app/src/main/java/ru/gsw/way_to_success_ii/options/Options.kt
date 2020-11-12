package ru.gsw.way_to_success_ii.options

import android.app.Activity
import android.os.Build
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import ru.gsw.way_to_success_ii.R

class Options {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun setStatusBarColor(activity: Activity) {
        val window = activity.window
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(activity, R.color.color_status_bar)
    }
}