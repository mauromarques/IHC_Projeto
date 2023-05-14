package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
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

        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_libraryFragment_to_subjectFragment)
        }

        val lib_title = view.findViewById<View>(R.id.library_title)
        val see_all = lib_title.findViewById<View>(R.id.library_see_all)

        see_all.alpha = 0F

        val mat_layout = view.findViewById<LinearLayout>(R.id.library_material_layout)

        for (i in 0 until mat_layout.childCount) {
            val childView = mat_layout.getChildAt(i)
            childView.setOnClickListener {
                findNavController().navigate(R.id.action_libraryFragment_to_materialFragment)
            }
        }


        return view
    }
}