package com.antech.zeroday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_receiving_message.*

class ReceivingMessage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiving_message)

        val bundle: Bundle? = intent.extras
        val message = bundle!!.getString("user_message")

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        txtUserMessage.text = message
    }
}
