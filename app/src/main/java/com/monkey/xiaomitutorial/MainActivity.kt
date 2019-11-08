package com.monkey.xiaomitutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        day_01_setup_activity.setOnClickListener {
            val intent = Intent(this, Day01SetupActivity::class.java)
            startActivity(intent)
        }
    }
}
