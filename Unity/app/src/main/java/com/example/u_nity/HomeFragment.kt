package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2

class HomeFragment : Fragment() {

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

        val title1 = sub1.findViewById<TextView>(R.id.title)
        title1.text = "Human-Computer Interaction"
        val title2 = sub2.findViewById<TextView>(R.id.title)
        title2.text = "Computer Architecture 2"
        val title3 = sub3.findViewById<TextView>(R.id.title)
        title3.text = "System Analysis"



        return view
    }
}