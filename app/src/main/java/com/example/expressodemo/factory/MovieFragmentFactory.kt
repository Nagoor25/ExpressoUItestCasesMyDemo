package com.example.expressodemo.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.expressodemo.ui.Fragment.DirectorsFragment
import com.example.expressodemo.ui.Fragment.MovieDetailFragment
import com.example.expressodemo.ui.Fragment.StarActorsFragment

class MovieFragmentFactory:FragmentFactory() {
    val TAG:String="MovieFragmentFactory"
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment=

        when (className){
          MovieDetailFragment::class.java.name->
           {
            MovieDetailFragment()
           }
            DirectorsFragment::class.java.name->
            {
              DirectorsFragment()
            }
           StarActorsFragment::class.java.name->
           {
               StarActorsFragment()
           }
          else
              ->{
                  super.instantiate(classLoader, className)
              }
        }

    }
