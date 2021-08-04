package com.divyanshu.quizapp

object constants{
    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val q1 = Question(id = 1 ,
            ques = "Which country's flag is it?" ,
            R.drawable.backgroundquizapp ,
            option1 = "Argentina" ,
            option2 = "Australia" ,
            option3 = "India" ,
            option4 = "Rio" ,
            corrAns = 1)
    questionList.add(q1)
        return questionList
    }
}