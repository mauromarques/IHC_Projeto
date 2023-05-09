package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

class StudyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragment = R.layout.fragment_study
        val view = inflater.inflate(fragment, container, false)
        val button = view.findViewById<ImageButton>(R.id.backButton)
        button.alpha = 0F
        return view
    }
}