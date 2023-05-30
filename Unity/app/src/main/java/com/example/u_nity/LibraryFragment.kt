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

class LibraryFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_library, container, false)

        val res1 = view.findViewById<View>(R.id.res1)
        res1.findViewById<TextView>(R.id.textView5).text = "Nielsen Heuristics Book "
        res1.findViewById<TextView>(R.id.resourceName).text = "(PDF)"

        val res2 = view.findViewById<View>(R.id.res2)
        res2.findViewById<TextView>(R.id.textView5).text = "Theory Exercise Sheet 2 "
        res2.findViewById<TextView>(R.id.resourceName).text = "(PDF)"

        val res3 = view.findViewById<View>(R.id.res3)
        res3.findViewById<TextView>(R.id.textView5).text = "Slides Lecture 1"
        res3.findViewById<TextView>(R.id.resourceName).text = "(PPTX)"

        val mat_layout = view.findViewById<LinearLayout>(R.id.library_material_layout)

        for (i in 0 until mat_layout.childCount) {
            val childView = mat_layout.getChildAt(i)
            if(i == 0){
                childView.setOnClickListener {
                    findNavController().navigate(R.id.action_subjectFragment_to_browseOnlineFragment)
                }
            } else {
                childView.setOnClickListener {
                    findNavController().navigate(R.id.action_subjectFragment_to_materialFragment2)
                }
            }
        }
        return view
    }
}