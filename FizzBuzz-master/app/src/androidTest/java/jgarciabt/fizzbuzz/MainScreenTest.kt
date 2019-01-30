package jgarciabt.fizzbuzz

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkScreen(){

       MainScreenRobot.uiCheckMainScreen()

    }

    @Test
    fun clickRockPaperButton(){

        MainScreenRobot.clickRockPaper()
                .checkScreen()
                .updatePlayerTwo("Rock")
                .updatePlayerTwo("PAPER")

    }


}