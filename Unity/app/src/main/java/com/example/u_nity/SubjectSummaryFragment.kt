package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class SubjectSummaryFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.course_summary, container, false)
        val sub1 = view.findViewById<View>(R.id.sub1)
        val image = sub1.findViewById<ImageView>(R.id.imageB)
        image.setImageResource(R.drawable.s1)
        sub1.findViewById<TextView>(R.id.title).text = "ATTENDANCE"
        sub1.findViewById<TextView>(R.id.sub11).text = "8 classes"
        sub1.findViewById<TextView>(R.id.sub23).text = "0 Absences"

        val sub3 = view.findViewById<View>(R.id.sub3)
        val image3 = sub3.findViewById<ImageView>(R.id.imageB)
        image3.setImageResource(R.drawable.s3)
        sub3.findViewById<TextView>(R.id.title).text = "GRADING"
        sub3.findViewById<TextView>(R.id.sub11).text = "T - 5/7"
        sub3.findViewById<TextView>(R.id.sub23).text = "P - 10/12"

        val sub2 = view.findViewById<View>(R.id.sub22)
        val image2 = sub2.findViewById<ImageView>(R.id.imageB)
        image2.setImageResource(R.drawable.s2)
        sub2.findViewById<TextView>(R.id.title).text = "NEXT EVENT"
        sub2.findViewById<TextView>(R.id.sub11).text = "16/05/23"
        sub2.findViewById<TextView>(R.id.sub23).text = "User test with app"

        return view
    }
}