package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var men:ImageView
    lateinit var women:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gender:String;

        men = findViewById(R.id.imgman);
        women = findViewById(R.id.imgwomen);

        men.setOnClickListener(View.OnClickListener {

          men.setImageResource(R.drawable.male_selected);
            women.setImageResource(R.drawable.female_unselected);
            gender = "Men";
            Toast.makeText(this, gender, Toast.LENGTH_LONG).show()
        })

        women.setOnClickListener(View.OnClickListener {
            men.setColorFilter(ContextCompat.getColor(this, R.color.black));
            women.setColorFilter(null)
            gender = "Women"
            Toast.makeText(this, gender, Toast.LENGTH_LONG).show()
        })
    }
}