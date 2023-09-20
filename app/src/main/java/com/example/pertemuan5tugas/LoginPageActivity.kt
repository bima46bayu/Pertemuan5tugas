package com.example.pertemuan5tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pertemuan5tugas.R
import com.example.pertemuan5tugas.databinding.ActivityLoginpageBinding

class LoginPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginpageBinding

    companion object {
        const val EXTRA_USERNAME = "username"
        const val EXTRA_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            btnLogin.setOnClickListener{

                val intentToHome = Intent(this@LoginPageActivity,Homepage2Activity::class.java)

                val username = edtUsername.text.toString()
                val password = edtPass.text.toString()

                intentToHome.putExtra(RegisterActivity.EXTRA_USERNAME, username)
                intentToHome.putExtra(RegisterActivity.EXTRA_PASSWORD, password)

                startActivity(intentToHome)
            }
        }

        val btnForgotPassword = findViewById<TextView>(R.id.btn_forgot_password)

        btnForgotPassword.setOnClickListener {
            val intentToForgotPassword = Intent(this@LoginPageActivity, ForgotPasswordActivity::class.java)
            startActivity(intentToForgotPassword)
        }
        val btnToRegister = findViewById<TextView>(R.id.btn_to_register)

        btnToRegister.setOnClickListener {
            val intentToRegister = Intent(this@LoginPageActivity, RegisterActivity::class.java)
            startActivity(intentToRegister)
        }

    }
}