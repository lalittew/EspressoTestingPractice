package game.lalit

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import jgarciabt.fizzbuzz.R

object RobotFizzBuzzScreen {
    fun uiCheckFizzBuzz()= apply{
        //Verify that input field is present
        onView(withId(R.id.number_input)).check(matches(isDisplayed()))

        //Verify that the FizzBuzz title is present
        onView(withId(R.id.tizz_buzz_tittle)).check(matches(isDisplayed()))

        //Verify that the FizzBuzz button is present
        onView(withId(R.id.fizz_buzz_button)).check(matches(isDisplayed()))

        //Verify the text of FizzBuzz button
        onView(withId(R.id.fizz_buzz_button)).check(matches(withText("Fizz/Buzz")))
    }

    //Function to enter number in input field
    fun inputNumber(number:String) = apply {
        onView(withId(R.id.number_input)).perform(typeText(number))
    }

    //Function to click the FizzBuzz button
    fun clickFizzBuzzButton() = apply {
        onView(withId(R.id.fizz_buzz_button)).perform(click())
    }

    //Function to verify the output
    fun checkResult(result:String) = apply {
        onView(withId(R.id.fizz_buzz_output)).check(matches(withText(result)))
    }
}