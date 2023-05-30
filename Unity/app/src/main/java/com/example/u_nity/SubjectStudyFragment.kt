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


        return view
    }
}