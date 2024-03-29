package com.asghar.viewpagervertical

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var viewpager : VerticalViewPager
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.verticalviewpager)

        val adapter = ViewPagerAdapter(this)

        var buttonForward : Button? = findViewById(R.id.button6)

        var buttonBackward : Button? = findViewById(R.id.button2)

        viewpager.adapter = adapter

        buttonForward?.setOnClickListener {
            viewpager.currentItem = viewpager.currentItem +1
        }

        buttonBackward?.setOnClickListener {
            viewpager.currentItem = viewpager.currentItem -1
        }

    }
}
