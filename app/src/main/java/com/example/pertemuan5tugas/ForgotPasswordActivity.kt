package com.example.pertemuan5tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.pertemuan5tugas.R
import com.example.pertemuan5tugas.LoginPageActivity

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var edtLupa: EditText
    private lateinit var btnNext: Button
    private lateinit var btnBack: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        edtLupa = findViewById(R.id.edt_lupa)
        btnNext = findViewById(R.id.btn_next)
        btnBack = findViewById(R.id.btn_back)


        btnNext.setOnClickListener {
            val email = edtLupa.text.toString()
        }

        btnBack.setOnClickListener {
            val intentToLogin = Intent(this@ForgotPasswordActivity, LoginPageActivity::class.java)
            startActivity(intentToLogin)
            finish() // Menambahkan finish() agar tidak dapat kembali ke halaman Forgot Password setelah kembali ke Login.
        }

    }
}
