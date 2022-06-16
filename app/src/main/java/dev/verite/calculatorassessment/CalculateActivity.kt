package dev.verite.calculatorassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculateActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etFirstNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivide = findViewById(R.id.btnDivide)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.toString().toDouble()
            val num2 = etSecondNumber.toString().toDouble()
            addition(num1,num2)
        }
        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.toString().toDouble()
            val num2 = etSecondNumber.toString().toDouble()
            subtraction(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1 = etFirstNumber.toString().toDouble()
            val num2 = etSecondNumber.toString().toDouble()
            remainder(num1,num2)
        }
        btnDivide.setOnClickListener {
            val num1 = etFirstNumber.toString().toDouble()
            val num2 = etSecondNumber.toString().toDouble()
            division(num1,num2)
        }

        btnAdd.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString()
            val number2 = etSecondNumber.text.toString()
            if (number1.isBlank()){
                tilFirstNumber.error = getString(R.string.first_number_is_required)
            }
            if (number2.isBlank()){
                tilSecondNumber.error = getString(R.string.second_number_is_required)
            }
        }
        btnSubtract.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString()
            val number2 = etSecondNumber.text.toString()
            if (number1.isBlank()){
                tilFirstNumber.error = getString(R.string.first_number_is_required)
            }
            if (number2.isBlank()){
                tilSecondNumber.error = getString(R.string.second_number_is_required)
            }

        }
        btnModulus.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString()
            val number2 = etSecondNumber.text.toString()
            if (number1.isBlank()){
                tilFirstNumber.error = getString(R.string.first_number_is_required)
            }
            if (number2.isBlank()){
                tilSecondNumber.error = getString(R.string.second_number_is_required)
            }
        }
        btnDivide.setOnClickListener {
            tvResult.text =""
            val number1 = etFirstNumber.text.toString()
            val number2 = etSecondNumber.text.toString()
            if (number1.isBlank()){
                tilFirstNumber.error = getString(R.string.first_number_is_required)
            }
            if (number2.isBlank()){
                tilSecondNumber.error = getString(R.string.second_number_is_required)
            }
        }
    }
        fun addition(num1: Double, num2: Double) {
            val add = num1 + num2
            tvResult.text = add.toString()
        }

        fun subtraction(num1: Double, num2: Double) {
            val sub = num1 - num2
            tvResult.text = sub.toString()
        }

        fun remainder(num1: Double, num2: Double) {
            val modulus = num1 % num2
            tvResult.text = modulus.toString()
        }

        fun division(num1: Double, num2: Double) {
            val divide = num1 / num2
            tvResult.text = divide.toString()
        }
}




