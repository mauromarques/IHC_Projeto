package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<ImageButton>(R.id.backButton)
        button.alpha = 0F

        val subject_title = view.findViewById<View>(R.id.title_subtitle)
        val material_title = view.findViewById<View>(R.id.title_subtitle2)
        val sub1 = view.findViewById<View>(R.id.subject1)
        val sub2 = view.findViewById<View>(R.id.subject2)
        val sub3 = view.findViewById<View>(R.id.subject3)
        val sub4 = view.findViewById<View>(R.id.subject4)

        val title1 = sub1.findViewById<TextView>(R.id.title)
        val title3 = sub3.findViewById<TextView>(R.id.title)
        val title2 = sub2.findViewById<TextView>(R.id.title)

        title3.text = "Databases"
        title2.text = "Computer Architecture 2"
        title1.text = "System Analysis"


        sub4.setOnClickListener {
            val act = activity as MainActivity
            val tab = act.tabLayout.getTabAt(2)
            tab!!.select()
        }

        val mat2 = view.findViewById<View>(R.id.material2)
        mat2.findViewById<TextView>(R.id.textView5).text = "IHC"
        mat2.findViewById<TextView>(R.id.resourceName).text = "Nielsen Heuristics Book"

        val mat3 = view.findViewById<View>(R.id.material3)
        mat3.findViewById<TextView>(R.id.textView5).text = "BD"
        mat3.findViewById<TextView>(R.id.resourceName).text = "SQL Cheat Sheet"

        return view

    }
}