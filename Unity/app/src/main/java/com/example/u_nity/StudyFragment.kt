package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text
import android.util.Log
import android.widget.ProgressBar
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

class StudyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragment = R.layout.fragment_study
        val view = inflater.inflate(fragment, container, false)
        val button = view.findViewById<ImageButton>(R.id.backButton)
        val title = view.findViewById<TextView>(R.id.title)
        val subtitle = view.findViewById<TextView>(R.id.subtitle)
        val sub1 = view.findViewById<View>(R.id.sub1)
        val sub2 = view.findViewById<View>(R.id.sub2)
        val sub3 = view.findViewById<View>(R.id.sub3)
        val sub4 = view.findViewById<View>(R.id.sub4)
        val bar3 = sub3.findViewById<ProgressBar>(R.id.determinateBar)
        val bar4 = sub4.findViewById<ProgressBar>(R.id.determinateBar)
        val title1 = sub1.findViewById<TextView>(R.id.title)
        val title2 = sub2.findViewById<TextView>(R.id.title)
        val title3 = sub3.findViewById<TextView>(R.id.title)
        val title4 = sub4.findViewById<TextView>(R.id.title)
        subtitle.text = "5 subjects enrolled"
        title.text = "Current Subjects"
        bar3.progress = 50
        bar4.progress = 80
        title1.text = "Computer Architecture 2"
        title2.text = "System Analysis"
        title3.text = "Databases"
        title4.text = "Human-Computer Interaction"
        sub4.setOnClickListener {
            Log.d("MAMAMIA", "CLICK")
            findNavController().navigate(R.id.action_studyFragment_to_subjectFragment)
            /*val subjectFrag = SubjectFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, subjectFrag)?.commit()*/
        }

        sub3.setOnClickListener {
            Log.d("MAMAMIA", "CLICK")
            findNavController().navigate(R.id.action_studyFragment_to_subjectBDFragment)
        }
        button.alpha = 0F

        return view
    }
}



/*val fragment = R.layout.fragment_study
val view = inflater.inflate(fragment, container, false)
val button = view.findViewById<ImageButton>(R.id.backButton)
val title = view.findViewById<TextView>(R.id.title)
val subtitle = view.findViewById<TextView>(R.id.subtitle)
val sub4 = view.findViewById<View>(R.id.sub4)
val bar4 = sub4.findViewById<ProgressBar>(R.id.determinateBar)
val title4 = sub4.findViewById<TextView>(R.id.title)
subtitle.text = "5 subjects enrolled"
title.text = "Current Subjects"
bar4.progress = 80
title4.text = "Computer Architecture 2"
sub4.setOnClickListener {
    Log.d("MAMAMIA", "CLICK")
}
button.alpha = 0F
return view*/