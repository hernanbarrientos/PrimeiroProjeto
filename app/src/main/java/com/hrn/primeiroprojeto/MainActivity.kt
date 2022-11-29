package com.hrn.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_INDEFINITE
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snackbar = Snackbar.make(
            findViewById(R.id.ll),
            "Mensagem de teste",
            Snackbar.LENGTH_INDEFINITE
        )

        val btnRegister : Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener {

            if(snackbar.isShown)
                snackbar.dismiss()
            else
                snackbar.show()

        }

    }
}