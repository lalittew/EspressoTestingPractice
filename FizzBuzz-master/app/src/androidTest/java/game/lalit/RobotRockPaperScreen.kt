package game.lalit

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import jgarciabt.fizzbuzz.R

import android.widget.ListView
import androidx.test.espresso.assertion.ViewAssertions
import org.hamcrest.*


object RobotRockPaperScreen {

    //Function to test Rock/Paper screen UI
    fun uiCheckRockPaperScreen()= apply{
        //Verify the title of Rock/Paper screen
        onView(withId(jgarciabt.fizzbuzz.R.id.rock_paper_tittle)).check(matches(withText("Rock-paper-scissors-lizard-spock")))

        //Verify that player 1 drop down is present with value as Rock
        onView(withId(jgarciabt.fizzbuzz.R.id.player_1)).check(matches(isDisplayed()))

        //Verify that Rock is present in player 1 drop down by default
        onView(withId(R.id.player_1)).check(matches(withSpinnerText("ROCK")))

        //Verify that player 2 drop down is present with value as Rock
        onView(withId(R.id.player_2)).check(matches(isDisplayed()))

        //Verify that Rock is present in player 2 drop down by default
        onView(withId(R.id.player_2)).check(matches(withSpinnerText("ROCK")))

        //Verify that Try button is present
        onView(withId(R.id.rock_paper_button)).check(matches(isDisplayed()))

        //Verify the text of Try button
        onView(withId(R.id.rock_paper_button)).check(matches(withText("TRY")))
    }

    //Function to click Player One drop down
    fun clickPlayerDropDown(player:Int) = apply {
        onView(withId(player)).perform(click())
    }

    //Function to select value from player 1 drop down
    fun selectPlayerValue(player:Int, playerValue:String) = apply{

        //Select value from player drop down
        onView(withText(playerValue)).inRoot(RootMatchers.isPlatformPopup()).perform(click())
    }

    //Function to click on TRY button
    fun clickTryButton() = apply{
      //  onView(withId(R.id.rock_paper_button)).perform(longClick())
        onView(withText("Try")).perform(click())
    }


    //Function to test the result
    fun checkResult(result:String) = apply {
        onView(withId(R.id.rock_paper_output)).check(matches(withText(result)))
    }



}