package jgarciabt.fizzbuzz

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RockPaperTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun bothPaperResultTie() {

        RockPaperRobot
                .navigateToRockGameScreen()
                .checkScreen()
                .updatePlayerOne("paper")
                .updatePlayerTwo("paper")
                .checkScreen()

        MainScreenRobot
                .clickRockPaper()

        RockPaperRobot
                .checkScreen()
                .updatePlayerOne("paper")
                .updatePlayerTwo("paper")
                .checkScreen()

    }

}