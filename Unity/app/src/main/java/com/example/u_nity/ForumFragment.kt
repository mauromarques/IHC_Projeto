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
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.navigation.fragment.findNavController

class SubjectForumFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forum, container, false) //change to fragment_forum once it's done
        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_forumFragment_to_subjectFragment)
        }
        val question1 = view.findViewById<LinearLayout>(R.id.question1)
        val mine_button = view.findViewById<Button>(R.id.MINE)
        val foryou_button = view.findViewById<Button>(R.id.FORYOU)

        foryou_button.setOnClickListener{

            foryou_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
            mine_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))


            foryou_button.backgroundTintList = null
            mine_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))

        }

        mine_button.setOnClickListener{

            mine_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
            foryou_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))


            mine_button.backgroundTintList = null
            foryou_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))

        }

        question1.setOnClickListener{

        }


        return view
    }
}


