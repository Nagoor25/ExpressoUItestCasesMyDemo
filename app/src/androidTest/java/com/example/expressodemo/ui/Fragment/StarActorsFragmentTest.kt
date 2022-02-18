package com.example.expressodemo.ui.Fragment

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.expressodemo.R
import com.example.expressodemo.factory.MovieFragmentFactory
import com.example.expressodemo.ui.Fragment.StarActorsFragment.Companion.stringBuilderForStarActors
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class StarActorsFragmentTest{
    @Test
    fun isStarActorsListAvailable(){
      //setup
        val starActors=arrayListOf("Dwayne Johnson", "Seann William Scott", "Rosario Dawson", "Christopher Walken")
        val fragmentFactory=MovieFragmentFactory()
        val bundle=Bundle()
        bundle.putStringArrayList("args_actors",starActors)
        val scenario= launchFragmentInContainer<StarActorsFragment>(
            fragmentArgs = bundle,
            factory = fragmentFactory
        )
        onView(withId(R.id.star_actors_text)).check(matches(withText(stringBuilderForStarActors(starActors))))
    }
}