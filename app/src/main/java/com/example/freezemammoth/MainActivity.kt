package com.example.freezemammoth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("vnd.youtube:dQw4w9WgXcQ"))
            startActivity(intent)
        }
    }
}
