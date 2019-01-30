package jgarciabt.fizzbuzz

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

object MainScreenRobot {
    fun uiCheckMainScreen() = apply {

        //test the presence of FizzBuzz button
        onView(withId(R.id.fizz_buzz_button)).check(matches(isDisplayed()))

        //test the presence of Rock Paper button
        onView(withId(R.id.rock_paper_button)).check(matches(isDisplayed()))
    }

    fun clickFizzBuzz() = apply {
        //click fizzBuzz button on main screen
        onView(withId(R.id.fizz_buzz_button)).perform(click())
    }

    // All buttons that connect with other screens should return the Robot
    // associated with that screen and NOT use the "= apply" block
    fun clickRockPaper(): RockPaperRobot  {
        //click fizzBuzz button on main screen
        onView(withId(R.id.rock_paper_button)).perform(click())

        return RockPaperRobot
    }



}