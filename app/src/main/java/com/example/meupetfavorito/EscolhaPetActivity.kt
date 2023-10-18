package com.example.meupetfavorito

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EscolhaPetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolha_pet)
        // Habilitar a seta de voltar na ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Encontrando os botões no layout usando findViewById
        val botaoCao = findViewById<Button>(R.id.botaoCao)
        val botaoGato = findViewById<Button>(R.id.botaoGato)

        botaoCao.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        botaoGato.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

