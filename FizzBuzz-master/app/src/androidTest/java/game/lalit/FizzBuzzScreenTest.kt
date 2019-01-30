package game.lalit

import android.test.suitebuilder.annotation.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import jgarciabt.fizzbuzz.FizzBuzzGameActivity
import jgarciabt.fizzbuzz.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class FizzBuzzScreenTest {
    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

   //Function to test Fizz number
    @Test
    fun testFizzNumber(){
       RobotMainScreen.clickFizzBuzzButton()
               .inputNumber("24")
               .clickFizzBuzzButton()
               .checkResult("Fizz")

   }

    //Function to test Buzz number
    @Test
    fun testBuzzNumber(){
        RobotMainScreen.clickFizzBuzzButton()
                .inputNumber("25")
                .clickFizzBuzzButton()
                .checkResult("Buzz")
    }

    //Function to test FizzBuzz number
    @Test
    fun testFizzBuzzNumber(){
        RobotMainScreen.clickFizzBuzzButton()
                .inputNumber("15")
                .clickFizzBuzzButton()
                .checkResult("FizzBuzz")
    }

    //Function to test normal number
    @Test
    fun testNormalNumber(){
        RobotMainScreen.clickFizzBuzzButton()
                .inputNumber("4")
                .clickFizzBuzzButton()
                .checkResult("4")
    }
}