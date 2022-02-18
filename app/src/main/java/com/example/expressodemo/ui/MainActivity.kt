package com.example.expressodemo.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import com.bumptech.glide.Glide.init
import com.example.expressodemo.R
import com.example.expressodemo.factory.MovieFragmentFactory
import com.example.expressodemo.ui.Fragment.MovieDetailFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory= MovieFragmentFactory()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      init()
    }

    private fun init() {

        if(supportFragmentManager.fragments.size==0){
            val movie_id=1
            val bundle=Bundle()
            bundle.putInt("movie_id",movie_id)
            this.supportFragmentManager.beginTransaction()
                .replace(R.id.container,MovieDetailFragment::class.java,bundle)
                .commit()
        }

    }
}