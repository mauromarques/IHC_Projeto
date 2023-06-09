package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class PersonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_person, container, false)

        val profile_title = view.findViewById<View>(R.id.profile_title)
        profile_title.findViewById<TextView>(R.id.title).text = "Profile"
        profile_title.findViewById<TextView>(R.id.subtitle).text = ""

        val button = view.findViewById<ImageButton>(R.id.backButton)
        button.alpha = 0F



        return view
    }
}