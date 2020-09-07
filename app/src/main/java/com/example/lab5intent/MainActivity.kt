package com.example.lab5intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickShowDetail()
        onClickReset()


    }
    fun onClickShowDetail(){
        registerBtn.setOnClickListener{
            val selectID:Int = radio.checkedRadioButtonId
            val checkedRadioText: RadioButton = findViewById(selectID)
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("stdData", Student(edit_name.text.toString(), checkedRadioText.text.toString(), edit_email.text.toString(), edit_salary.text.toString().toInt()))
            startActivity(intent)
        }
    }
    fun onClickReset(){
        btn_reset.setOnClickListener{
            edit_name.text?.clear()
            edit_email.text?.clear()
            edit_salary.text.clear()
            radio.clearCheck()
        }
    }

    fun onClickShowDetail(view: View) {}
    fun onClickReset(view: View) {}
}
