package com.asghar.viewpagervertical

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var viewpager : VerticalViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.verticalviewpager)

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter

    }
}
