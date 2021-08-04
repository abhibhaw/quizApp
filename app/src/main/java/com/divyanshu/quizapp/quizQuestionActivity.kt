package com.divyanshu.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class quizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        val listques = constants.getQuestions()
        Log.i("Question size","${listques.size}")
    }

}