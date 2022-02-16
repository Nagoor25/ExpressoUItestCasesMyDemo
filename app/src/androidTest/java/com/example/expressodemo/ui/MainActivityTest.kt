package com.example.expressodemo.ui
import org.junit.Test
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expressodemo.R


class MainActivityTest {
    //Header
    //first simple Main Activity ui tests
    @Test
    fun testActivity_isInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))// Method1 to view is visible
    }

    @Test
    fun testNextButton_isInView_or_visible() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        //  onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))//method 1
        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method2
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
    }

    @Test
    fun testIsTitle_isDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(
            matches(
                withText(
                    R.string.text_mainactivity
                )
            )
        )
    }

    //
// 3 Navigation MainActivity ui tests
    @Test
    fun test_navigationToSecondActivity() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    @Test
    fun test_backPress_to_mainActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
        //   onView(withId(R.id.button_back)).perform(click()) // method1
        pressBack()// method 2
        onView(withId(R.id.main)).check(matches(isDisplayed()))

    }
}