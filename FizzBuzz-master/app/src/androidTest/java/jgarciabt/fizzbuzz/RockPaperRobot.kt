package jgarciabt.fizzbuzz

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

object RockPaperRobot {

    fun checkScreen() = apply {
        onView(withId(R.id.rock_paper_tittle)).check(matches(withText("Rock-paper-scissors-lizard-spock")))
        onView(withId(R.id.rock_paper_button)).check(matches(withText("TRY")))

    }

    fun clickTry() = apply {  }

    fun updatePlayerOne(option: String) = apply {  }

    fun updatePlayerTwo(option: String) = apply {  }

    fun navigateToRockGameScreen() = apply {

        MainScreenRobot
                .clickRockPaper()
    }
}