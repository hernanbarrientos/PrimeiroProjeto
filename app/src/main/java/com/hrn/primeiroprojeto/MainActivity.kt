package com.hrn.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_INDEFINITE
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtnNewUser : ImageButton = findViewById(R.id.img_btn_new_user)
        imgBtnNewUser.setOnClickListener {
            Toast.makeText(
                this,
                "Novo Usuário",
                Toast.LENGTH_LONG)
                .show()
        }

        val btnRegister : Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener {

        }

        val toggleButton : ToggleButton = findViewById(R.id.toggleButton2)
        toggleButton.setOnCheckedChangeListener{ compoundButton, state ->
            if (state){
                Toast.makeText(this,"Habilitado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Desabilitado", Toast.LENGTH_SHORT).show()
            }
        }

        val switch : SwitchCompat = findViewById(R.id.switch2)
        switch.setOnCheckedChangeListener { compoundButton, state ->
            if (state){
                Toast.makeText(this,"Habilitado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Desabilitado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}