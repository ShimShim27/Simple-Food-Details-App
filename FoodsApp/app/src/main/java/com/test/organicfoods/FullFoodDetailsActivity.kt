package com.test.organicfoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources

class FullFoodDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_food_details)

        supportActionBar?.hide()

        val bundles = intent.extras
        if (bundles != null){
            findViewById<ImageView>(R.id.foodImage)
                .setImageDrawable(AppCompatResources
                    .getDrawable(this,bundles.getInt("imageResource")))


            findViewById<TextView>(R.id.foodName).text = bundles.getString("name")
            findViewById<TextView>(R.id.foodDescription).text = bundles.getString("description")
        }
    }



    fun onBackButtonClicked(v: View){
        finish()
    }


    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.always_visible,R.anim.slide_out)
    }
}