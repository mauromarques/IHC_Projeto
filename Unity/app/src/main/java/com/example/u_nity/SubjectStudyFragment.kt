package com.example.u_nity

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SubjectStudyFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.course_study, container, false)

        val browse_button = view.findViewById<View>(R.id.library_search_button)
        val upload_button = view.findViewById<View>(R.id.library_upload_button)

        browse_button.setOnClickListener{
            // open LibraryFragment
        }


        return view
    }
}