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

        //10
        val que10 = Question(
            10, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_lebanon,
            "Jamaica", "Ecuador",
            "Lebanon", "Bulgaria",
            3)
        questionsList.add(que10)

        //11
        val que11 = Question(
            11, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_jamaica,
            "Jamaica", "Belarus",
            "Cameroon", "Angola",
            1)
        questionsList.add(que11)

        //12
        val que12 = Question(
            12, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_angola,
            "Myanmar", "Senegal",
            "Vietnam", "Angola",
            4)
        questionsList.add(que12)

        //13
        val que13 = Question(
            13, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_bulgaria,
            "Paraguay", "Bulgaria",
            "Uganda", "none of these",
            2)
        questionsList.add(que13)

        //14
        val que14 = Question(
            14, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_belarus,
            "Belarus", "Uganda",
            "Maldives", "Bulgaria",
            1)
        questionsList.add(que14)

        //15
        val que15 = Question(
            15, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_cameroon,
            "Myanmar", "Mali",
            "Cameroon", "Senegal",
            3)
        questionsList.add(que15)

        //16
        val que16 = Question(
            16, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "Turkey", "Vietnam",
            "Moldova", "China",
            4)
        questionsList.add(que16)

        //17
        val que17 = Question(
            17, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_costa_rica,
            "Thailand", "Costa Rica",
            "Bulgaria", "none of these",
            2)
        questionsList.add(que17)

        //18
        val que18 = Question(
            18, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_croatia,
            "Croatia", "Bulgaria",
            "Costa Rica", "Sweden",
            1)
        questionsList.add(que18)

        //19
        val que19 = Question(
            19, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_czech_republic,
            "Paraguay", "Bulgaria",
            "Uganda", "Czech Republic",
            4)
        questionsList.add(que19)

        //20
        val que20 = Question(
            20, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_ecuador,
            "Mali", "Spain",
            "Ecuador", "Romania",
            3)
        questionsList.add(que20)

        //21
        val que21 = Question(
            21, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "France", "Italy",
            "Romania", "Netherlands",
            1)
        questionsList.add(que21)

        //22
        val que22 = Question(
            22, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_greece,
            "Iceland", "Greece",
            "Poland", "Paraguay",
            2)
        questionsList.add(que22)

        //23
        val que23 = Question(
            23, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_iceland,
            "Australia", "Ireland",
            "Iceland", "England",
            3)
        questionsList.add(que23)

        //24
        val que24 = Question(
            24, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_iran,
            "Iran", "Iraq",
            "Oman", "none of these",
            1)
        questionsList.add(que24)

        //25
        val que25 = Question(
            25, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_israel,
            "Iran", "Israel",
            "Paraguay", "Iceland",
            2)
        questionsList.add(que25)

        //26
        val que26 = Question(
            26, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_liechtenstein,
            "Mali", "Peru",
            "Luxembourg", "Liechtenstein",
            4)
        questionsList.add(que26)

        //27
        val que27 = Question(
            27, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_luxembourg,
            "Liechtenstein", "Netherlands",
            "Luxembourg", "Thailand",
            3)
        questionsList.add(que27)

        //28
        val que28 = Question(
            28, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_malaysia,
            "Malaysia", "Turkey",
            "Ecuador", "Croatia",
            1)
        questionsList.add(que28)

        //29
        val que29 = Question(
            29, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_maldives,
            "Myanmar", "Moldova",
            "Mali", "Maldives",
            4)
        questionsList.add(que29)

        //30
        val que30 = Question(
            30, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_mali,
            "Senegal", "Mali",
            "Maldives", "Romania",
            2)
        questionsList.add(que30)

        //31
        val que31 = Question(
            31, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_turkey,
            "Bulgaria", "China",
            "Bosnia", "Turkey",
            4)
        questionsList.add(que31)

        //32
        val que32 = Question(
            32, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "Senegal", "Zambia",
            "Mexico", "Italy",
            3)
        questionsList.add(que32)

        //33
        val que33 = Question(
            33, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_moldova,
            "Moldova", "Mali",
            "Senegal", "Romania",
            1)
        questionsList.add(que33)

        //34
        val que34 = Question(
            34, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_myanmar,
            "Senegal", "Moldova",
            "Jamaica", "Myanmar",
            4)
        questionsList.add(que34)

        //35
        val que35 = Question(
            35, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_netherlands,
            "Poland", "Russia",
            "Netherlands", "France",
            3)
        questionsList.add(que35)

        //36
        val que36 = Question(
            36, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_norway,
            "Finland", "Norway",
            "Bulgaria", "Hungary",
            2)
        questionsList.add(que36)

        //37
        val que37 = Question(
            37, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_peru,
            "Peru", "Ecuador",
            "Mexico", "Canada",
            1)
        questionsList.add(que37)

        //38
        val que38 = Question(
            38, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_paraguay,
            "Belgium", "Paraguay",
            "Poland", "Russia",
            2)
        questionsList.add(que38)

        //39
        val que39 = Question(
            39, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_romania,
            "Germany", "Belgium",
            "Jamaica", "Romania",
            4)
        questionsList.add(que39)

        //40
        val que40 = Question(
            40, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_senegal,
            "Mali", "Moldova",
            "Senegal", "Mexico",
            3)
        questionsList.add(que40)

        //41
        val que41 = Question(
            41, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_spain,
            "Spain", "Iran",
            "Yemen", "Uganda",
            1)
        questionsList.add(que41)

        //42
        val que42 = Question(
            42, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_sweden,
            "Wales", "Iceland",
            "Sweden", "Ireland",
            3)
        questionsList.add(que42)

        //43
        val que43 = Question(
            43, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_switzerland,
            "Turkey", "Switzerland",
            "Peru", "Monaco",
            2)
        questionsList.add(que43)

        //44
        val que44 = Question(
            44, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Russia", "Netherlands",
            "Austria", "Thailand",
            4)
        questionsList.add(que44)

        //45
        val que45 = Question(
            45, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_zambia,
            "Zambia", "Malaysia",
            "Lebanon", "Mexico",
            1)
        questionsList.add(que45)

        //46
        val que46 = Question(
            46, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_uganda,
            "Senegal", "Jamaica",
            "Uganda", "Ecuador",
            3)
        questionsList.add(que46)

        //47
        val que47 = Question(
            47, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_ukraine,
            "Russia", "Ukraine",
            "Sweden", "Romania",
            2)
        questionsList.add(que47)

        //48
        val que48 = Question(
            48, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_united_arab_emirates,
            "Estonia", "Kuwait",
            "Iraq", "United Arab Emirates",
            4)
        questionsList.add(que48)

        //49
        val que49 = Question(
            49, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_united_kingdom,
            "United Kingdom", "Australia",
            "Austria", "Ireland",
            1)
        questionsList.add(que49)

        //50
        val que50 = Question(
            50, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_united_states_of_america,
            "South Korea", "Argentina",
            "United States Of America", "England",
            3)
        questionsList.add(que50)

        //51
        val que51 = Question(
            51, "Which country does this flag belong to?",
            R.drawable.ic_flag_of_vietnam,
            "North Korea", "Vietnam",
            "China", "Turkey",
            2)
        questionsList.add(que51)

        return questionsList

    }
}