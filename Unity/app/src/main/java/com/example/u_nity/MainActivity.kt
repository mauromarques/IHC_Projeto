package com.example.u_nity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.u_nity.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout : TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupTabBar()
    }

    private fun setupTabBar() {
        val vp = findViewById<ViewPager2>(R.id.viewPager)
        tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val adapter = TabPageAdapter(this, tabLayout.tabCount)
        vp.adapter = adapter
        vp.isUserInputEnabled = false

        vp.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback()
            {
                override fun onPageSelected(position: Int) {
                    tabLayout.selectTab(tabLayout.getTabAt(position))
                }
            }
        )

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                vp.currentItem = tab?.position ?: 0
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

}