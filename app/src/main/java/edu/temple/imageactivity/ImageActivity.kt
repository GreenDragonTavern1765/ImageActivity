package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<View>(R.id.layout)

        val image = findViewById<ImageView>(R.id.arrynImage)
        val imageName = findViewById<TextView>(R.id.imageName)
        val imageDescription = findViewById<TextView>(R.id.imageDescription)
        image.setOnClickListener {
            imageName.text = "Hello there"
            imageDescription.text = "This is the picture's description"
        }

    }
}