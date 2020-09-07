package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        onClickClose()

        var data = intent.extras
        var newStudent: Student? = data?.getParcelable("stdData")
        nameText.text = "Name : ${newStudent?.name}"
        genderText.text = "Gender : ${newStudent?.gender} "
        emailText.text = "Email : ${newStudent?.email} "
        salaryText.text = "Salary : ${newStudent?.salary} "

    }

    fun onClickClose() {
        btnclose.setOnClickListener {
            finish()
        }
    }
}