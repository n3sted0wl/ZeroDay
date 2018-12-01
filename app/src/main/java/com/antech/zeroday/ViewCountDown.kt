package com.antech.zeroday

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_count_down.*

class ViewCountDown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_count_down) // gets the activity_view_count_down xml file

        btnShowToast.setOnClickListener {
            Log.i("ViewCountdown", "Button was clicked!")
            Toast.makeText(this, "Toast button was clicked", Toast.LENGTH_SHORT).show()
        }

    }

    /*
     * In tools > sdk manager, check out which packages you have
     */
}
