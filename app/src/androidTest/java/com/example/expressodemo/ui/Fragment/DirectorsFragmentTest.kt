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
import com.example.expressodemo.ui.Fragment.DirectorsFragment.Companion.stringBuilderForDirectors
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DirectorsFragmentTest{
   @Test
  fun isDirectorsListVisible(){
       // setup
      val directors= arrayListOf<String>("R.J. Stewart", "James Vanderbilt")
       val fragmentFactory=MovieFragmentFactory()
       val bundle=Bundle()
       bundle.putStringArrayList("args_directors",directors)

     val scenario= launchFragmentInContainer<DirectorsFragment>(
        fragmentArgs =bundle,
         factory=fragmentFactory
     )
       onView(withId(R.id.directors_text)).check(matches(withText(stringBuilderForDirectors(directors))))
  }
}