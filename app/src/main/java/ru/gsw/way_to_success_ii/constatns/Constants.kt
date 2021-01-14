package ru.gsw.way_to_success_ii.constatns

object Constants {

    const val character_quantity_buttons = 5
    const val needs_quantity_buttons = 3
    const val work_quantity_buttons = 5
    const val quality_quantity_buttons = 4
    const val establishments_quantity_buttons = 2

    const val duration_animation_window_buttons: Long = 150
    const val duration_animation_status_bars: Long = 300

    val days_per_move = mapOf("baby" to 30, "child" to  30, "youth" to  14, "adult" to  1, "old" to  1)

    val game_buttons_food_Baby = arrayOf("drink_milk")
    val game_buttons_food_child = arrayOf("eat_soup")
    val game_buttons_food_youth = arrayOf("eat_canteen")
    val game_buttons_food_adult = arrayOf("eat_garbage")
    val game_buttons_food_old = arrayOf("eat_garbage")
}