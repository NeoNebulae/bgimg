package com.example.bgimage

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    private var isImage1 = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        imageView = findViewById(R.id.image_view)

        button.setOnClickListener {
            if (isImage1) {
                imageView.setImageResource(R.drawable.image2)
                isImage1 = false
            } else {
                imageView.setImageResource(R.drawable.image1)
                isImage1 = true
            }
        }
    }
}
