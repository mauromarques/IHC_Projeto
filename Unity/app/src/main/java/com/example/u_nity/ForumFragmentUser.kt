package com.example.u_nity

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class AddQuestionDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.question_preview, null)
        val fragment = inflater.inflate(R.layout.fragment_forum_user,null)
        val question1 = fragment.findViewById<RelativeLayout>(R.id.question1)
        val questionTitleEditText = view.findViewById<EditText>(R.id.title)
        val questionBodyEditText = view.findViewById<EditText>(R.id.subtitle)

        val dialog = AlertDialog.Builder(requireActivity())
            .setTitle("Add a Question")
            .setView(view)
            .setPositiveButton("POST") { _, _ ->
                val title = questionTitleEditText.text.toString()
                val body = questionBodyEditText.text.toString()
                var old_title = question1.findViewById<TextView>(R.id.question_title)
                var old_body = question1.findViewById<TextView>(R.id.questionBody)
                old_title = questionTitleEditText
                old_body = questionBodyEditText
            }
            .setNegativeButton("CANCEL", null)
            .create()

        return dialog
    }
}
class ForumFragmentUser : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forum_user, container, false)

        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_forumFragmentUser_to_subjectFragment)
        }
        val add_question1 = view.findViewById<RelativeLayout>(R.id.add_question)
        val mine_button = view.findViewById<Button>(R.id.MINE)
        val foryou_button = view.findViewById<Button>(R.id.FORYOU)

        mine_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
        foryou_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))

        mine_button.backgroundTintList = null
        foryou_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))

        foryou_button.setOnClickListener{
            foryou_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#000000")))
            mine_button.setTextColor(ColorStateList.valueOf(Color.parseColor("#B0B0B0")))

            foryou_button.backgroundTintList = null
            mine_button.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#EFEFEF"))
            findNavController().navigate(R.id.action_forumFragmentUser_to_forumFragment)
        }

        add_question1.setOnClickListener{
            showAddQuestionDialog()
        }

        return view
    }

    private fun showAddQuestionDialog() {
        val dialogFragment = AddQuestionDialogFragment()
        dialogFragment.show(requireFragmentManager(), "AddQuestionDialog")
    }
}
