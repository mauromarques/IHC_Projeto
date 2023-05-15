package com.example.u_nity

import android.app.AlertDialog
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController

class MaterialFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_material, container, false)

        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_materialFragment_pop)
        }
        val downloadButton = view.findViewById<View>(R.id.download)
        downloadButton.setOnClickListener {
            withButtonCentered(view)
        }
        val addButton = view.findViewById<View>(R.id.add_library)
        addButton.setOnClickListener {
            withButtonCentered2(view)
        }
        var fill = false
        val heartButton = view.findViewById<ImageButton>(R.id.heart)
        heartButton.setOnClickListener {
            if (fill){
                fill = false
                heartButton.setImageResource(R.drawable.heart)
            } else {
                fill = true
                heartButton.setImageResource(R.drawable.heart_fill)
            }

        }

        return view
    }

    fun withButtonCentered(view: View) {

        val alertDialog = AlertDialog.Builder(activity).create()
        alertDialog.setTitle("Download Resource?")
        alertDialog.setMessage("size: 418kb")

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes"
        ) { dialog, which -> dialog.dismiss() }

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No"
        ) { dialog, which -> dialog.dismiss() }
        alertDialog.show()

        val btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
        val btnNegative = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)

        val layoutParams = btnPositive.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = 10f
        btnPositive.layoutParams = layoutParams
        btnNegative.layoutParams = layoutParams
    }

    fun withButtonCentered2(view: View) {

        val alertDialog = AlertDialog.Builder(activity).create()
        alertDialog.setTitle("Added to library")
        alertDialog.setMessage("Check it out")

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK"
        ) { dialog, which -> dialog.dismiss() }
        alertDialog.show()

        val btnPositive = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)

        val layoutParams = btnPositive.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = 10f
        btnPositive.layoutParams = layoutParams
    }
}