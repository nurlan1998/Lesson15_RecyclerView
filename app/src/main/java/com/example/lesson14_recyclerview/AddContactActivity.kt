package com.example.lesson14_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_contact.*

class AddContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)

        btnAdd.setOnClickListener {

            var firstName = edFirstName.text.toString()
            var lastName = edLastName.text.toString()
            var phoneNumber = edPhoneNumber.text.toString()

            val contact: User = User()

            contact.title = firstName
            contact.description = lastName
//            contact.phoneNumber = phoneNumber

//            contacts.add(contact)
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
