package game.lalit

import android.test.suitebuilder.annotation.LargeTest
import android.view.View
import android.widget.ListView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import jgarciabt.fizzbuzz.FizzBuzzGameActivity
import jgarciabt.fizzbuzz.MainActivity
import jgarciabt.fizzbuzz.R
import jgarciabt.fizzbuzz.RockPaperActivity
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class RockPaperScreenTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    //Function to test the UI of Rock/Paper screen
    @Test
    fun uiCheckRockPaperScreen(){
        RobotMainScreen.clickRockPaperButton()
                .uiCheckRockPaperScreen()
    }

    //Function to test Player 1 wins
    @Test
    fun playerOneWin(){
        RobotMainScreen.clickRockPaperButton()
                .selectPlayerValue(R.id.player_1, "PAPER")
                .selectPlayerValue(R.id.player_2,"ROCK")
                .clickTryButton()
                .checkResult("Player one wins")
    }

    //Function to test Player 2 wins
    @Test
    fun playerTwoWin(){
        RobotMainScreen.clickRockPaperButton()
                .selectPlayerValue(R.id.player_1,"LIZARD")
                .selectPlayerValue(R.id.player_2,"SCISSORS")
                .clickTryButton()
                .checkResult("Player two wins")

    }

    //Function to test Tie match
    @Test
    fun tieMatch(){
        RobotMainScreen.clickRockPaperButton()
                .clickPlayerDropDown(R.id.player_1)
                .selectPlayerValue(R.id.player_1,"SPOCK")
                .clickPlayerDropDown(R.id.player_2)
                .selectPlayerValue(R.id.player_2,"SPOCK")
                .clickTryButton()
                .checkResult("Tie!")
    }

    @Test
    fun checkSize(){
        RobotMainScreen.clickRockPaperButton()
               .clickPlayerDropDown(R.id.player_1)

        onView (withId (R.id.player_1)).check(ViewAssertions.matches(game.lalit.Matchers().withListSize(1)))
    }




}