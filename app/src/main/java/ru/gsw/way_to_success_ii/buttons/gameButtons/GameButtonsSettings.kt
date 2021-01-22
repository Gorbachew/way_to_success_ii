package ru.gsw.way_to_success_ii.buttons.gameButtons

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

class GameButtonsSettings (private val gameActivity: GameActivity) {

    fun getParameters(name: String): GameButtonParameters{
        val gbp = GameButtonParameters()
        when(name){
            "food_drink_milk" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_drink_milk)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "food_eat_dirt" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_eat_dirt)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "food_eat_delicious" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_eat_delicious)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "food_eat_soup" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_eat_soup)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "food_digging_garbage" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_digging_garbage)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "food_beach_lunch" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_beach_lunch)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "food_fast_food" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_fast_food)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "food_cafe" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_cafe)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "food_restaurant" ->{
                gbp.title = gameActivity.resources.getString(R.string.food_restaurant)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "health_sleep" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_sleep)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "health_plantain" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_plantain)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "health_grandmother" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_grandmother)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "health_herbs" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_herbs)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "health_parents" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_parents)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "health_homeopathy" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_homeopathy)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "health_state_hospital" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_state_hospital)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "health_private_hospital" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_private_hospital)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "health_social_help" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_social_help)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "health_urine_therapy" ->{
                gbp.title = gameActivity.resources.getString(R.string.health_urine_therapy)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "mood_laugh" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_laugh)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "mood_dream" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_dream)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "mood_toys" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_toys)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "mood_yard" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_yard)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "mood_electronic_games" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_electronic_games)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "mood_drink_beer" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_drink_beer)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "mood_cinema" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_cinema)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "mood_TV" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_TV)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "mood_PC" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_PC)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "mood_standup" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_standup)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "mood_concert" ->{
                gbp.title = gameActivity.resources.getString(R.string.mood_standup)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "hobbies_try_walk" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_try_walk)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "hobbies_moo" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_moo)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "hobbies_smile" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_smile)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_draw_wallpaper" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_draw_wallpaper)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "hobbies_karate" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_karate)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "hobbies_puzzles" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_puzzles)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_peers" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_peers)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "hobbies_hide_seek" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_hide_seek)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "hobbies_draw" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_draw)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_candy" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_candy)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_stones" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_stones)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_olympiad" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_olympiad)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "hobbies_chat_people" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_chat_people)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_walk" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_walk)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "hobbies_apples" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_apples)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "hobbies_hall" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_hall)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_program" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_program)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "hobbies_tricks" ->{
                gbp.title = gameActivity.resources.getString(R.string.hobbies_tricks)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "freelance_рelp" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_рelp)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_lemonade" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_lemonade)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_flyers" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_flyers)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_sweets" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_sweets)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "freelance_сonstruction_site" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_сonstruction_site)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_neighbors" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_neighbors)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "freelance_tutor" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_tutor)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "freelance_draw" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_draw)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_taxi" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_taxi)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_sites" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_sites)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "freelance_standup" ->{
                gbp.title = gameActivity.resources.getString(R.string.freelance_standup)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "legalwork_volunteer" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_volunteer)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "legalwork_shesterochka" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_shesterochka)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "legalwork_housing_office" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_housing_office)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "legalwork_factory" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_factory)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "legalwork_bank" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_bank)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "legalwork_programmer" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_programmer)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "legalwork_lawyer" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_lawyer)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "legalwork_official" ->{
                gbp.title = gameActivity.resources.getString(R.string.legalwork_official)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "unlegalwork_peers" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_peers)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_pockets" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_pockets)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_bookmark" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_bookmark)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_people" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_people)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_phone" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_phone)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_stall" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_stall)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_cars" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_cars)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "unlegalwork_business" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_business)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_moonshine" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_moonshine)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "unlegalwork_pension_fund" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_pension_fund)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "unlegalwork_stocks" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_stocks)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "unlegalwork_organs" ->{
                gbp.title = gameActivity.resources.getString(R.string.unlegalwork_organs)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "business_gang" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_gang)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "business_shawarma" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_shawarma)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "business_shop" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_shop)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "business_cafe" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_cafe)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "business_farm" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_farm)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "business_game_studio" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_game_studio)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "business_advertising_agency" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_advertising_agency)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "business_factory" ->{
                gbp.title = gameActivity.resources.getString(R.string.business_factory)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "education_kindergarten" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_kindergarten)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "education_school" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_school)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "education_college" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_college)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "education_university" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_university)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "education_overseas_university" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_overseas_university)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "education_business_training" ->{
                gbp.title = gameActivity.resources.getString(R.string.education_business_training)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }


            "property_toys" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_toys)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "property_cheap_clothes" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_cheap_clothes)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "property_table_games" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_table_games)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_console" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_console)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_good_clothes" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_good_clothes)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_stylish_clothes" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_stylish_clothes)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_work_clothes" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_work_clothes)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_TV" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_TV)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "property_computer" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_computer)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_jewelry" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_jewelry)
                gbp.price = 100
                gbp.onClick = { GameButtonsParameters(gameActivity).drinkMilk(gbp.price) }
            }
            "property_cheap_car" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_cheap_car)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "property_perfume" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_perfume)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_weapon" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_weapon)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_branded_clothing" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_branded_clothing)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_foreign_car" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_foreign_car)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_sports_car" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_sports_car)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "property_helicopter" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_helicopter)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "property_yacht" ->{
                gbp.title = gameActivity.resources.getString(R.string.property_yacht)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "immovables_tent" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_tent)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "immovables_rent_room" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_rent_room)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "immovables_rent_apartment" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_rent_apartment)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "immovables_apartment" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_apartment)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "immovables_house" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_house)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "immovables_mansion" ->{
                gbp.title = gameActivity.resources.getString(R.string.immovables_mansion)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

            "corruption_hooligans" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_hooligans)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "corruption_gopniks" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_gopniks)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "corruption_criminals" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_criminals)
                gbp.price = 10
                gbp.onClick = { GameButtonsParameters(gameActivity).eatSoup() }
            }
            "corruption_fines" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_fines)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "corruption_cops" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_cops)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "corruption_PR" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_PR)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }
            "corruption_preelection_campaign" ->{
                gbp.title = gameActivity.resources.getString(R.string.corruption_preelection_campaign)
                gbp.price = 50
                gbp.onClick = { GameButtonsParameters(gameActivity).eatGarbage() }
            }

        }
        return gbp

    }

}