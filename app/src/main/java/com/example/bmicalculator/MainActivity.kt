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

          men.setImageResource(R.drawable.baseline_man_24);
            women.setImageResource(R.drawable.baseline_womanunselected_24);
            gender = "Men";
            Toast.makeText(this, gender, Toast.LENGTH_LONG).show()
        })

        women.setOnClickListener(View.OnClickListener {

            men.setImageResource(R.drawable.baseline_manunselected_24);
            women.setImageResource(R.drawable.baseline_woman_24);
            gender = "Women"
            Toast.makeText(this, gender, Toast.LENGTH_LONG).show()
        })
    }
}