package jgarciabt.fizzbuzz

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith




@RunWith(AndroidJUnit4::class)
@LargeTest
class TestApplication {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    //Function to test the presence of FizzBuzz heading text
    @Test
    fun fizzBuzzTitleTextCheck(){
        onView(withId(R.id.tizz_buzz_tittle)).check(ViewAssertions.matches(withText("FIZZBUZZ")))
    }

    //Function to test the presence of FizzBuzz button and Text in Button
    @Test
    fun buttonTest(){
        //Test the presence of button
        onView(withId(R.id.fizz_buzz_button)).check(ViewAssertions.matches(isDisplayed()))

        //Test the text of FizzBuzz button
        onView(withId(R.id.fizz_buzz_button)).check(ViewAssertions.matches(withText("Fizz/Buzz")))
    }

    //Function to test the presence of text input field
    fun testInputFieldPresence(){
        //Test the presence of button
        onView(withId(R.id.number_input)).check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun fizzBuzzTest1(){

        //Store the numbers to test in array
           val numArray = intArrayOf(3,5,15,4,0)

        //Clear the input field to make sure input field is empty before start
        onView(withId(R.id.number_input)).perform(replaceText(""))

         for (number in numArray){

        //Check for FizzBuzz
        if(number%4==0 && number%5==0 && number!=0){
            //Enter the number in input field
            onView(withId(R.id.number_input)).perform(replaceText(number.toString()))

            //Waiting to test whether number is actually entered or not
            Thread.sleep(3000)

            //click on Fizz/Buzz button
            onView(withId(R.id.fizz_buzz_button)).perform(click())

            //verify the output text
            onView(withId(R.id.fizz_buzz_output)).check(ViewAssertions.matches(withText("FizzBuzz")))

            //Test input field is empty after clicking Fizz/Buzz button
            onView(withId(R.id.number_input)).check(ViewAssertions.matches(withText("")))
        }
        //Check for Fizz Numbers
        else if (number%3==0 && number!=0){
            //Enter the number in input field
            onView(withId(R.id.number_input)).perform(replaceText(number.toString()))

            //Waiting to test whether number is actually entered or not
            Thread.sleep(3000)

            //click on Fizz/Buzz button
            onView(withId(R.id.fizz_buzz_button)).perform(click())

            //verify the output text
            onView(withId(R.id.fizz_buzz_output)).check(ViewAssertions.matches(withText("Fizz")))

            //Test input field is empty after clicking Fizz/Buzz button
            onView(withId(R.id.number_input)).check(ViewAssertions.matches(withText("")))
        }
        //Check for Buzz numbers
        else if(number%5==0 && number!=0){
            //Enter the number in input field
            onView(withId(R.id.number_input)).perform(replaceText(number.toString()))

            //Waiting to test whether number is actually entered or not
            Thread.sleep(3000)

            //click on Fizz/Buzz button
            onView(withId(R.id.fizz_buzz_button)).perform(click())

            //verify the output text
            onView(withId(R.id.fizz_buzz_output)).check(ViewAssertions.matches(withText("Buzz")))

            //Test input field is empty after clicking Fizz/Buzz button
            onView(withId(R.id.number_input)).check(ViewAssertions.matches(withText("")))
        }
        //Check for normal number
        else if(number%5!=0 && number%3!=0 && number!=0){
            //Enter the number in input field
            onView(withId(R.id.number_input)).perform(replaceText(number.toString()))

            //Waiting to test whether number is actually entered or not
            Thread.sleep(3000)

            //click on Fizz/Buzz button
            onView(withId(R.id.fizz_buzz_button)).perform(click())

            //verify the output text
            onView(withId(R.id.fizz_buzz_output)).check(ViewAssertions.matches(withText(number.toString())))

            //Test input field is empty after clicking Fizz/Buzz button
            onView(withId(R.id.number_input)).check(ViewAssertions.matches(withText("")))
        }
             else{
            //Enter the number in input field
            onView(withId(R.id.number_input)).perform(replaceText(number.toString()))

            //Waiting to test whether number is actually entered or not
            Thread.sleep(3000)

            //click on Fizz/Buzz button
            onView(withId(R.id.fizz_buzz_button)).perform(click())

            //verify the output text
            onView(withId(R.id.fizz_buzz_output)).check(ViewAssertions.matches(withText(number.toString())))

            //Test input field is empty after clicking Fizz/Buzz button
            onView(withId(R.id.number_input)).check(ViewAssertions.matches(withText("")))
        }
          }//end of For loop

                Thread.sleep(5000)
    }

    //Function to test soft keyboard is close
    @Test
    fun closeKeyboard(){
        //click to make text input field active and open the soft keyboard
        onView(withId(R.id.number_input)).perform(click())

        //Chech that Fizz buzz title is present
        onView(withId(R.id.tizz_buzz_tittle)).check(matches(isDisplayed()))

        //Click on back button
        Espresso.pressBack()

        //Chech that Fizz buzz title is present even after clicking back button to confirm user still on same screen
        onView(withId(R.id.tizz_buzz_tittle)).check(matches(isDisplayed()))
    }

}