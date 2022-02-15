package com.example.expressodemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expressodemo.ui.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    @Test
    fun testActivity_isInView(){
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))// Method1 to view is visible
    }
@Test
    fun testNextButton_isInView_or_visible(){
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
      //  onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))//method 1
        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method2
      onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
    }
    @Test
    fun testIsTitle_isDisplayed(){
        val activityScenario=ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity
        )))
    }

}