package com.antech.zeroday

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_count_down.*

class ViewCountDown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_count_down) // gets the activity_view_count_down xml file

        // event handlers
        btnShowToast.setOnClickListener {
            Log.i("ViewCountdown", "Button was clicked!")
            Toast.makeText(this, "Toast button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            // now go into the second activity, passing in the user input
            val intent = Intent(this, ReceivingMessage::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}
