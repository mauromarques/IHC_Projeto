package com.example.u_nity

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class SubjectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_subject, container, false)
        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_subjectFragment_to_studyFragment)
        }

        val fragment = SubjectSummaryFragment()
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.course_frame_container,fragment)?.commit()

        val segmented_bar = view.findViewById<View>(R.id.segmented_bar)
        val summary_button = segmented_bar.findViewById<Button>(R.id.summary_button)
        val study_button = segmented_bar.findViewById<Button>(R.id.study_button)
        val forum_button = segmented_bar.findViewById<Button>(R.id.forum_button)

        study_button.setOnClickListener{
            val fragment = SubjectStudyFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.course_frame_container,fragment)?.commit()

            study_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
            summary_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))
            forum_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))

            study_button.backgroundTintList = null
            summary_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
            forum_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
        }

        summary_button.setOnClickListener{
            val fragment = SubjectSummaryFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.course_frame_container,fragment)?.commit()

            study_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))
            summary_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
            forum_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))

            study_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
            summary_button.backgroundTintList = null
            forum_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
        }

        forum_button.setOnClickListener{

            study_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))
            summary_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))
            forum_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))

            study_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
            summary_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
            forum_button.backgroundTintList = null

            findNavController().navigate(R.id.action_subjectFragment_to_forumFragment)
        }

        return view
    }
}