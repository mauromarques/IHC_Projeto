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
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

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

class SubjectForumFragment : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(
            R.layout.fragment_forum,
            container,
            false
        ) //change to fragment_forum once it's done
        val backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_forumFragment_to_subjectFragment)
        }
        val filter = view.findViewById<Button>(R.id.FILTERS)
        val top = view.findViewById<View>(R.id.titleLayout)
        top.findViewById<TextView>(R.id.title).text = "IHC - ALL POSTS"
        filter.setOnClickListener {
            showSingleChoiceListDialog()
        }
        val question1 = view.findViewById<RelativeLayout>(R.id.question1)

        question1.setOnClickListener {
            findNavController().navigate(R.id.action_forumFragment_to_subjectForumExpanded)
        }

        val floatingActionButton = view.findViewById<FloatingActionButton>(R.id.floating_action)

        floatingActionButton.setOnClickListener {
            showAddQuestionDialog()
        }

        return view

    }
    private fun showAddQuestionDialog() {
        val dialogFragment = AddQuestionDialogFragment()
        dialogFragment.show(requireFragmentManager(), "AddQuestionDialog")
    }
    private fun showSingleChoiceListDialog() {
        val options = arrayOf("ALL", "YOUR POSTS", "USERS POSTS") // Replace with your desired options

        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setTitle("Select a filter")
        dialogBuilder.setSingleChoiceItems(options, 0) { dialog, which ->
            // Handle the selected choice here
            val selectedChoice = options[which]
            updateForumViewBasedOnChoice(selectedChoice)
            dialog.dismiss()
        }
        dialogBuilder.setPositiveButton("OK", null)

        val dialog = dialogBuilder.create()
        dialog.show()
    }
    private fun updateForumViewBasedOnChoice(choice: String) {
        val top = requireView().findViewById<View>(R.id.titleLayout)
        val question1 = requireView().findViewById<RelativeLayout>(R.id.question1)
        val question2 = requireView().findViewById<RelativeLayout>(R.id.question2)
        val question3 = requireView().findViewById<RelativeLayout>(R.id.question3)
        val question4 = requireView().findViewById<RelativeLayout>(R.id.question4)


        when (choice) {
            "ALL" -> {
                top.findViewById<TextView>(R.id.title).text = "IHC - ALL POSTS"
                question1.findViewById<TextView>(R.id.question_title).text = "You selected Choice 1"
                question1.findViewById<TextView>(R.id.questionBody).text = "Some other text for Choice 1"
            }
            "YOUR POSTS" -> {
                top.findViewById<TextView>(R.id.title).text = "IHC - YOUR POSTS"
                question1.findViewById<TextView>(R.id.question_title).text = "You selected Choice 2"
                question1.findViewById<TextView>(R.id.questionBody).text = "Some other text for Choice 2"
            }
            "USERS POSTS" -> {

                top.findViewById<TextView>(R.id.title).text = "IHC - USERS POSTS"
                question1.findViewById<TextView>(R.id.question_title).text = "You selected Choice 3"
                question1.findViewById<TextView>(R.id.questionBody).text = "Some other text for Choice 3"
            }
        }
    }

}


/*   questionList = view.findViewById<LinearLayout>(R.id.questionList)
   questions = listOf(
       Question(A, "How do I use Kotlin in Android?", "I'm new to Android development and I want to use Kotlin instead of Java. How do I get started?", 5),
       Question(B, "What's the best way to learn Android development?", "I'm a beginner and I want to learn how to develop Android apps. What resources should I use?", 2),
       Question(C, "How do I implement push notifications in my app?", "I want to send push notifications to my users when new content is available. How can I do this?", 3)
   )

   for (question in questions) {
       addQuestion(question)
   }

private fun addQuestion(question: Question) {
    val questionView = layoutInflater.inflate(R.layout.forum_row, null)
    val idView = questionView.findViewById<TextView>(R.id.autor)
    idView.text = question.id

    val titleView = questionView.findViewById<TextView>(R.id.question_title)
    titleView.text = question.title

    val bodyView = questionView.findViewById<TextView>(R.id.questionBody)
    bodyView.text = question.body

    val ratingView = questionView.findViewById<TextView>(R.id.text_votes)
    ratingView.text = question.rating.toString()

    questionView.setOnClickListener { onQuestionClick(question.id) }

    questionList.addView(questionView)
}*/



