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