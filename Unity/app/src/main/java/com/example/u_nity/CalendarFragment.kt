package com.example.u_nity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

class CalendarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_calendar, container, false)

        val events_title = view.findViewById<View>(R.id.events_title)
        events_title.findViewById<TextView>(R.id.title).text = "Events"
        events_title.findViewById<TextView>(R.id.subtitle).text = "2 days until next event"

        val button = view.findViewById<ImageButton>(R.id.backButton)
        button.alpha = 0F

        return view
    }
}