package ghorbani.amir.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austria",
            "Australia", "Armenia",
            1)
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "England", "Austria",
            "Australia", "Canada",
            3)
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bulgaria", "Belgium",
            "Hungary", "Germany",
            2)
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Ireland",
            "Jordan", "Mexico",
            1)
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Belarus", "Sweden",
            "Finland", "Denmark",
            4)
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Australia", "New Zealand",
            "Fiji", "none of these",
            3)
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium", "Germany",
            "Italy", "Netherlands",
            2)
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Iran",
            "Iraq", "Indonesia",
            1)
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Iraq", "Kuwait",
            "United Arab Emirates", "none of these",
            2)
        questionsList.add(que9)

        return questionsList

    }
}