package game.lalit

import android.test.suitebuilder.annotation.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import jgarciabt.fizzbuzz.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainScreenTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    //Function to test UI of main screen
    @Test
    fun uiCheckMainScreen(){
        RobotMainScreen.uiCheck()
    }

    //Function to test clicking on FizzBuzz button takes user to Fizz Buzz screen
    @Test
    fun clickFizzBuzzButton(){
        RobotMainScreen.clickFizzBuzzButton()
                .uiCheckFizzBuzz()

    }

    //Function to test clicking on Rock/Paper button takes user to Rock/Paper screen
    @Test
    fun clickRockPaperButton(){
        RobotMainScreen.clickRockPaperButton()
                .uiCheckRockPaperScreen()
    }
}