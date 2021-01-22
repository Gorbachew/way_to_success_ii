package ru.gsw.way_to_success_ii.constatns

import android.widget.Toast

object Constants {

    const val character_quantity_buttons = 5
    const val needs_quantity_buttons = 3
    const val work_quantity_buttons = 5
    const val quality_quantity_buttons = 4
    const val establishments_quantity_buttons = 2

    const val duration_animation_window_buttons: Long = 150
    const val duration_animation_status_bars: Long = 300

    val days_per_move = mapOf("baby" to 30, "child" to  30, "youth" to  14, "adult" to  1, "old" to  1)

    val buttons = mutableMapOf(
        "food" to mutableMapOf(
            "baby" to arrayOf("food_drink_milk"),
            "child" to arrayOf("food_eat_dirt", "food_eat_soup", "food_eat_delicious"),
            "youth" to arrayOf("food_digging_garbage", "food_beach_lunch", "food_fast_food"),
            "adult" to arrayOf("food_digging_garbage", "food_beach_lunch", "food_fast_food", "food_cafe", "food_restaurant"),
            "old" to arrayOf("food_digging_garbage", "food_beach_lunch", "food_fast_food", "food_cafe", "food_restaurant")
        ),
        "health" to mutableMapOf(
            "baby" to arrayOf("health_sleep"),
            "child" to arrayOf("health_plantain", "health_parents"),
            "youth" to arrayOf("health_herbs", "health_grandmother"),
            "adult" to arrayOf("health_herbs", "health_homeopathy", "health_state_hospital", "health_private_hospital"),
            "old" to arrayOf("health_urine_therapy", "health_herbs", "health_social_help", "health_homeopathy", "health_state_hospital", "health_private_hospital")
        ),
        "mood" to mutableMapOf(
            "baby" to arrayOf("mood_laugh"),
            "child" to arrayOf("mood_dream", "mood_toys"),
            "youth" to arrayOf("mood_yard", "mood_boardgames", "mood_electronic_games"),
            "adult" to arrayOf("mood_drink_beer", "mood_cinema", "mood_friends", "mood_TV", "mood_PC", "mood_standup", "mood_concert"),
            "old" to arrayOf("mood_drink_beer", "mood_cinema", "mood_friends", "mood_TV", "mood_PC", "mood_standup", "mood_concert")
        ),
        "hobbies" to mutableMapOf(
            "baby" to arrayOf("hobbies_try_walk", "hobbies_moo", "hobbies_smile", "hobbies_draw_wallpaper"),
            "child" to arrayOf("hobbies_karate", "hobbies_puzzles", "hobbies_peers", "hobbies_hide_seek", "hobbies_draw", "hobbies_candy"),
            "youth" to arrayOf("hobbies_stones", "hobbies_olympiad", "hobbies_chat_people", "hobbies_walk", "hobbies_apples"),
            "adult" to arrayOf("hobbies_walk", "hobbies_chat_people", "hobbies_draw", "hobbies_hall", "hobbies_program", "hobbies_tricks"),
            "old" to arrayOf("hobbies_walk", "hobbies_chat_people", "hobbies_draw", "hobbies_hall", "hobbies_program", "hobbies_tricks")
        ),
        "freelance" to mutableMapOf(
            "child" to arrayOf("freelance_рelp", "freelance_lemonade"),
            "youth" to arrayOf("freelance_flyers", "freelance_sweets", "freelance_сonstruction_site"),
            "adult" to arrayOf("freelance_neighbors", "freelance_tutor", "freelance_draw", "freelance_taxi", "freelance_sites", "freelance_standup"),
            "old" to arrayOf("freelance_neighbors", "freelance_tutor", "freelance_draw", "freelance_taxi", "freelance_sites", "freelance_standup")
        ),
        "legalwork" to mutableMapOf(
            "youth" to arrayOf("legalwork_volunteer"),
            "adult" to arrayOf("legalwork_shesterochka", "legalwork_housing_office", "legalwork_factory", "legalwork_bank", "legalwork_programmer", "legalwork_lawyer", "legalwork_official"),
            "old" to arrayOf("legalwork_bank", "legalwork_programmer", "legalwork_lawyer", "legalwork_official")
        ),
        "unlegalwork" to mutableMapOf(
            "youth" to arrayOf("unlegalwork_peers", "unlegalwork_pockets", "unlegalwork_bookmark"),
            "adult" to arrayOf("unlegalwork_people", "unlegalwork_phone", "legalwork_factory", "unlegalwork_stall", "unlegalwork_cars", "unlegalwork_business", "unlegalwork_stocks", "unlegalwork_organs"),
            "old" to arrayOf("unlegalwork_moonshine", "unlegalwork_business", "unlegalwork_pension_fund", "unlegalwork_stocks", "unlegalwork_organs")
        ),
        "business" to mutableMapOf(
            "youth" to arrayOf("business_gang"),
            "adult" to arrayOf("business_gang", "business_shawarma", "business_shop", "business_cafe", "business_farm", "business_game_studio", "business_advertising_agency", "business_factory"),
            "old" to arrayOf("business_gang", "business_shawarma", "business_shop", "business_cafe", "business_farm", "business_game_studio", "business_advertising_agency", "business_factory")
        ),
        "education" to mutableMapOf(
            "child" to arrayOf("education_kindergarten"),
            "youth" to arrayOf("education_school", "education_college", "education_university"),
            "adult" to arrayOf("education_school", "education_college", "education_university", "education_overseas_university", "education_business_training"),
            "old" to arrayOf("education_school", "education_college", "education_university", "education_overseas_university", "education_business_training")
        ),
        "property" to mutableMapOf(
            "child" to arrayOf("property_toys"),
            "youth" to arrayOf("property_cheap_clothes", "property_table_games", "property_console", "property_good_clothes", "property_stylish_clothes"),
            "adult" to arrayOf("property_cheap_clothes", "property_work_clothes", "property_good_clothes", "property_stylish_clothes", "property_TV", "property_computer",
            "property_jewelry", "property_cheap_car", "property_perfume", "property_business_clothes", "property_weapon", "property_branded_clothing", "property_foreign_car",
            "property_sports_car", "property_helicopter", "property_yacht"),
            "old" to arrayOf("property_cheap_clothes", "property_work_clothes", "property_good_clothes", "property_stylish_clothes", "property_TV", "property_computer",
                "property_jewelry", "property_cheap_car", "property_perfume", "property_business_clothes", "property_weapon", "property_branded_clothing", "property_foreign_car",
                "property_sports_car", "property_helicopter", "property_yacht")
        ),
        "immovables" to mutableMapOf(
            "child" to arrayOf("immovables_tent"),
            "youth" to arrayOf("immovables_tent", "immovables_rent_room"),
            "adult" to arrayOf("immovables_tent", "immovables_rent_room", "immovables_rent_apartment", "immovables_apartment", "immovables_house", "immovables_mansion"),
            "old" to arrayOf("immovables_tent", "immovables_rent_room", "immovables_rent_apartment", "immovables_apartment", "immovables_house", "immovables_mansion")
        ),
        "corruption" to mutableMapOf(
            "child" to arrayOf("corruption_hooligans"),
            "youth" to arrayOf("corruption_gopniks"),
            "adult" to arrayOf("corruption_criminals", "corruption_treat_bar", "corruption_fines", "corruption_cops", "corruption_PR", "corruption_preelection_campaign"),
            "old" to arrayOf("corruption_criminals", "corruption_treat_bar", "corruption_fines", "corruption_cops", "corruption_PR", "corruption_preelection_campaign")
        ),
    )
}