package com.example.astrocore.activities

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.TextView
import com.example.astrocore.R

class HomeActivity : AppCompatActivity() {
    private lateinit var layout1 :View
    private lateinit var layout2 : View
    private lateinit var layout3 : View
    private lateinit var persontage1 : TextView
    private lateinit var persontage2 : TextView
    private lateinit var persontage3 : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the status bar and navigation bar to transparent
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

        // Set the status bar and navigation bar background to transparent
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        setContentView(R.layout.activity_welcome)
        setContentView(R.layout.activity_login)
        setContentView(R.layout.activity_home)

        layout1 = findViewById(R.id.mercurylayout)
        layout2 = findViewById(R.id.venuslayout)
        layout3 = findViewById(R.id.earthlayout)
        persontage1 = findViewById(R.id.mercurypersontage)
        persontage2 = findViewById(R.id.venuspersontage)
        persontage3 = findViewById(R.id.earthpersontage)

    }
}