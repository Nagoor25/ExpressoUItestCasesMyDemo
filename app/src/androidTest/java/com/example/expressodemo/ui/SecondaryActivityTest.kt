package com.example.expressodemo.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expressodemo.R
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    /**
     * ActivityScenarioRule:
     * https://developer.android.com/reference/androidx/test/ext/junit/rules/ActivityScenarioRule.html
     */

    @get:Rule
    val activityScenario = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivity_inView(){
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))//method 1
    }

    @Test
    fun test_isBackButton_inView(){
        onView(withId(R.id.button_back)).
        check(matches(withEffectiveVisibility(Visibility.VISIBLE))) //method 2
    }

   @Test
    fun test_isTitle_isDisplayed(){
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed()))
    }

}