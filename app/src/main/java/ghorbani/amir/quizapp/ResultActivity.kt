package ghorbani.amir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText


class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val ivResultImage : ImageView = findViewById(R.id.iv_result_image)
        val tvResultName : TextView = findViewById(R.id.tv_result_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnResultFinish : Button = findViewById(R.id.btn_result_Finish)

        ivResultImage.setImageResource(R.drawable.ic_trophy)
        tvResultName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        btnResultFinish.setOnClickListener {
           startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }

}