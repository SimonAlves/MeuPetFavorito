package com.example.meupetfavorito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vermifugos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vermifugos)

        val botaoVerMelhores = findViewById<Button>(R.id.botaoVerMelhores)
        botaoVerMelhores.setOnClickListener {
            val intent = Intent(this, MelhoresVermifugos::class.java)
            startActivity(intent)
        }
    }
}
