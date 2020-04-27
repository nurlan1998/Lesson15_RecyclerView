package com.example.lesson14_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvName.text = intent.getStringExtra("title")
        tvLastName.text = intent.getStringExtra("lastName")
        tvDetailPhoneNumber.text = intent.getStringExtra("phoneNumber")
    }
}
