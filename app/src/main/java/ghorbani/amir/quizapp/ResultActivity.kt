package ghorbani.amir.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText


class ResultActivity : AppCompatActivity() {

    private var ivResultImage : ImageView? = null
    private var tvResultName : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        ivResultImage = findViewById(R.id.iv_result_image)
        ivResultImage?.setImageResource(R.drawable.ic_trophy)
        tvResultName = findViewById(R.id.tv_result_name)
    }

}