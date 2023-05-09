package com.example.u_nity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.u_nity.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var mainBind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBind.root)
        setupTabBar()
    }

    private fun setupTabBar() {
        val adapter = TabPageAdapter(this, mainBind.tabLayout.tabCount)
        mainBind.viewPager.adapter = adapter

        mainBind.viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback()
            {
                override fun onPageSelected(position: Int) {
                    mainBind.tabLayout.selectTab(mainBind.tabLayout.getTabAt(position))
                }
            }
        )

        mainBind.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                mainBind.viewPager.currentItem = tab?.position ?: 0
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

}