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

class ForumFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forum, container, false) //change to fragment_forum once it's done
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
        /*   questionList = view.findViewById<LinearLayout>(R.id.questionList)
           questions = listOf(
               Question(A, "How do I use Kotlin in Android?", "I'm new to Android development and I want to use Kotlin instead of Java. How do I get started?", 5),
               Question(B, "What's the best way to learn Android development?", "I'm a beginner and I want to learn how to develop Android apps. What resources should I use?", 2),
               Question(C, "How do I implement push notifications in my app?", "I want to send push notifications to my users when new content is available. How can I do this?", 3)
           )

           for (question in questions) {
               addQuestion(question)
           }
    */

    /*
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



