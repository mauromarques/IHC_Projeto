package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
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

        val browse_layout = view.findViewById<LinearLayout>(R.id.browse_linear_layout)

        for (i in 0 until browse_layout.childCount) {
            val childView = browse_layout.getChildAt(i)
            childView.setOnClickListener {
                findNavController().navigate(R.id.action_browseOnlineFragment_to_materialFragment)
            }
        }

        return view
    }
}