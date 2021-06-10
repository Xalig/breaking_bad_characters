package com.example.someapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_breakingbad_details.*

class breakingbad_details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakingbad_details)

        var bundle: Bundle = intent.extras!!
        var name  = bundle.getString("constName")
        var description = bundle.getString("constDescription")
        var image = bundle.getInt("constImage")

        detailName.text = name
        detailDescription.text = description
        detailImage.setImageResource(image)
    }
}