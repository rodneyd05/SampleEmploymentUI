package com.thisisit.employmentui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.thisisit.employmentui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        //applying for
        mainBinding.positionApplyingForEdittext.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputPosition = mainBinding.positionApplyingForEdittext.text.toString()

                mainBinding.positionTextView.text = inputPosition

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        //Date Available
        mainBinding.dateAvailableForWorkEdittext.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputDate = mainBinding.dateAvailableForWorkEdittext.text.toString()

                mainBinding.dateAvailableTextView.text = inputDate

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        //Desired Salary
        mainBinding.desiredSalaryEdittext.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputSalary = mainBinding.desiredSalaryEdittext.text.toString()

                mainBinding.salaryTextView.text = "P$inputSalary"

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        //First Name
        mainBinding.firstName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputFirstName = mainBinding.firstName.text.toString()

                mainBinding.firstNameTextView.text = inputFirstName

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        //Last Name
        mainBinding.lastName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputLastName = mainBinding.lastName.text.toString()

                mainBinding.lastNameTextView.text = " $inputLastName"

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        //City
        mainBinding.city.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                val inputCity = mainBinding.city.text.toString()

                mainBinding.cityTextView.text = inputCity

            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
    }

    @Suppress("UNUSED_PARAMETER")
    fun expandView0(view: View) {
        val v = mainBinding.additionalContent.visibility == View.GONE
        if (v) {
            mainBinding.additionalContent.visibility = View.VISIBLE
            mainBinding.arrow0.setImageResource(R.drawable.arrow_up)
        } else {
            mainBinding.additionalContent.visibility = View.GONE
            mainBinding.arrow0.setImageResource(R.drawable.arrow_down)
        }
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

    @Suppress("UNUSED_PARAMETER")
    fun expandView3(view: View) {
        val v = mainBinding.employmentContent.visibility == View.GONE
        if (v) {
            mainBinding.employmentContent.visibility = View.VISIBLE
            mainBinding.arrow3.setImageResource(R.drawable.arrow_down)
        } else {
            mainBinding.employmentContent.visibility = View.GONE
            mainBinding.arrow3.setImageResource(R.drawable.arrow_right)
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun expandView4(view: View) {
        val v = mainBinding.referencesContent.visibility == View.GONE
        if (v) {
            mainBinding.referencesContent.visibility = View.VISIBLE
            mainBinding.arrow4.setImageResource(R.drawable.arrow_down)
        } else {
            mainBinding.referencesContent.visibility = View.GONE
            mainBinding.arrow4.setImageResource(R.drawable.arrow_right)
        }
    }
}