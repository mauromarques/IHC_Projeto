package com.example.u_nity

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController

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

        val lib_title = view.findViewById<View>(R.id.library_title)
        val see_all = lib_title.findViewById<View>(R.id.library_see_all)
        val browse_button = view.findViewById<View>(R.id.library_search_button)
        val upload_button = view.findViewById<View>(R.id.library_upload_button)

        browse_button.setOnClickListener{
            findNavController().navigate(R.id.action_subjectFragment_to_browseOnlineFragment)
        }

        see_all.setOnClickListener{
            findNavController().navigate(R.id.action_subjectFragment_to_libraryFragment)
        }

        val mat_layout = view.findViewById<LinearLayout>(R.id.study_material_layout)

        for (i in 0 until mat_layout.childCount) {
            val childView = mat_layout.getChildAt(i)
            childView.setOnClickListener {
                findNavController().navigate(R.id.action_subjectFragment_to_materialFragment2)
            }
        }

        val lib1 = view.findViewById<View>(R.id.lib1)
        lib1.findViewById<TextView>(R.id.textView5).text = "Nielsen Heuristics Book"
        lib1.findViewById<TextView>(R.id.resourceName).text = "(PDF)"

        val lib2 = view.findViewById<View>(R.id.lib2)
        lib2.findViewById<TextView>(R.id.textView5).text = "Slides lecture 1"
        lib2.findViewById<TextView>(R.id.resourceName).text = "(PPTX)"

        val plan1 = view.findViewById<View>(R.id.plan1)
        plan1.findViewById<TextView>(R.id.time).text = "13:00 - 13:40"
        plan1.findViewById<TextView>(R.id.title_plan).text = "Prepare IHC presentation"
        plan1.findViewById<TextView>(R.id.date).text = "26/04/2023 - 02/06/2023"

        val plan2 = view.findViewById<View>(R.id.plan2)
        plan2.findViewById<TextView>(R.id.time).text = "14:00 - 16:00"
        plan2.findViewById<TextView>(R.id.title_plan).text = "Finish app for delivery"
        plan2.findViewById<TextView>(R.id.date).text = "10/05/2023 - 24/05/2023"

        val plan3 = view.findViewById<View>(R.id.plan3)
        plan3.findViewById<TextView>(R.id.time).text = "18:00 - 19:30"
        plan3.findViewById<TextView>(R.id.title_plan).text = "Study for exam"
        plan3.findViewById<TextView>(R.id.date).text = "15/05/2023 - 11/06/2023"

        return view
    }
}