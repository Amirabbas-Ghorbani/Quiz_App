package ghorbani.amir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_Start)
        val etEditTextBox : EditText = findViewById(R.id.et_EditTextBox)

        btnStart.setOnClickListener {

            if (etEditTextBox.text.isEmpty()){
                Toast.makeText(this, "Please enter your name.", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etEditTextBox.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}