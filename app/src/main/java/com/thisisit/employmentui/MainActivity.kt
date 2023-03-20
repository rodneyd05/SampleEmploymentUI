package com.thisisit.employmentui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import com.thisisit.employmentui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }

    @Suppress("UNUSED_PARAMETER")
    fun expandView(view: View) {
        val v = mainBinding.personalContent.visibility == View.GONE
        if (v) {
            mainBinding.personalContent.visibility = View.VISIBLE
            mainBinding.arrow.setImageResource(R.drawable.arrow_down)
        } else {
            mainBinding.personalContent.visibility = View.GONE
            mainBinding.arrow.setImageResource(R.drawable.arrow_right)
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun expandView2(view: View) {
        val v = mainBinding.educationContent.visibility == View.GONE
        if (v) {
            mainBinding.educationContent.visibility = View.VISIBLE
            mainBinding.arrow2.setImageResource(R.drawable.arrow_down)
        } else {
            mainBinding.educationContent.visibility = View.GONE
            mainBinding.arrow2.setImageResource(R.drawable.arrow_right)
        }
    }
}