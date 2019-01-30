package game.lalit

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import jgarciabt.fizzbuzz.R
import kotlinx.android.synthetic.main.activity_main.view.*

object RobotMainScreen {

    fun uiCheck() = apply {
        //Verify that FizzBuzz button is present
        onView(withId(R.id.fizz_buzz_button)).check(matches(isDisplayed()))

        //Verify the text of fizzBuzz button
        onView(withId(R.id.fizz_buzz_button)).check(matches(withText("FizzBuzz")))

        //Verify that Rock/Paper button is present
        onView(withId(R.id.rock_paper_button)).check(matches(isDisplayed()))

        //Verify the text of Rock/Paper button
        onView(withId(R.id.rock_paper_button)).check(matches(withText("Rock/Paper")))
    }

    fun clickFizzBuzzButton():RobotFizzBuzzScreen {
        //click the FizzBuzz button
        onView(withId(R.id.fizz_buzz_button)).perform(click())


        return RobotFizzBuzzScreen
    }

    fun clickRockPaperButton(): RobotRockPaperScreen {
        //click the RockPaper button
        onView(withId(R.id.rock_paper_button)).perform(click())

        return RobotRockPaperScreen
    }
}