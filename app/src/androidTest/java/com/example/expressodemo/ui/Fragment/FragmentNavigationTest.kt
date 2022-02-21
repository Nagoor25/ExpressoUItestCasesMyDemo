package com.example.expressodemo.ui.Fragment

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expressodemo.R
import com.example.expressodemo.ui.MainActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class FragmentNavigationTest {
    @Test
    fun isTestMovieFragmentNavigation(){
        //setup
        val scenario=ActivityScenario.launch(MainActivity::class.java)
       //navigation to Directors Fragment (After loading Movie details Fragment in mainActivity)
        onView(withId(R.id.movie_directiors)).perform(click())
        //verify
        onView(withId(R.id.directors_fragment_parent)).check(matches(isDisplayed()))
        pressBack()
        //Verify
        onView(withId(R.id.movie_detail_fragment_parent)).check(matches(isDisplayed()))
       //navigation to Star Actors
        onView(withId(R.id.movie_star_actors)).perform(click())
        //verify
        onView(withId(R.id.star_actors_fragment_parent)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.movie_detail_fragment_parent)).check(matches(isDisplayed()))

    }
}