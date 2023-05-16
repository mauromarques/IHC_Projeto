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

class BrowseOnlineFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_browse_online, container, false)

        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_browseOnlineFragment_to_subjectFragment)
        }

        val mat1 = view.findViewById<View>(R.id.mat1)
        mat1.findViewById<TextView>(R.id.textView5).text = "Nielsen Heuristics Book"
        mat1.findViewById<TextView>(R.id.resourceName).text = "(PDF)"
        mat1.setOnClickListener {
            findNavController().navigate(R.id.action_browseOnlineFragment_to_materialFragment)
        }

        val mat2 = view.findViewById<View>(R.id.mat2)
        mat2.findViewById<TextView>(R.id.textView5).text = "Exam from last year"
        mat2.findViewById<TextView>(R.id.resourceName).text = "(PDF)"
        mat2.setOnClickListener {
            findNavController().navigate(R.id.action_browseOnlineFragment_to_materialFragment)
        }

        val mat3 = view.findViewById<View>(R.id.mat3)
        mat3.findViewById<TextView>(R.id.textView5).text = "Slides (Introduction)"
        mat3.findViewById<TextView>(R.id.resourceName).text = "(PPTX)"
        mat3.setOnClickListener {
            findNavController().navigate(R.id.action_browseOnlineFragment_to_materialFragment)
        }

        val mat4 = view.findViewById<View>(R.id.mat4)
        mat4.findViewById<TextView>(R.id.textView5).text = "Theory Exercise Sheet 2"
        mat4.findViewById<TextView>(R.id.resourceName).text = "(PDF)"
        mat4.setOnClickListener {
            findNavController().navigate(R.id.action_browseOnlineFragment_to_materialFragment)
        }

        val browse_title = view.findViewById<View>(R.id.title_subtitle)
        browse_title.findViewById<TextView>(R.id.title).text = "Online Catalog"

        return view
    }
}