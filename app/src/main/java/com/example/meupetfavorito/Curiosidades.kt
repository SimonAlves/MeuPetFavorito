package com.example.meupetfavorito
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Curiosidades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curiosidades)

        // Supondo que você tenha os arrays 'titulos' e 'links' definidos
        val titulos = listOf(
            "Veja  5 dicas de brincadeiras e brinquedos para gato!",
            "Veja como escolher brinquedos para os cães!",
            "Veja 10 alimentos que o cachorro não pode comer!",
            "Cachorro Dormir na Cama?Entenda!",
            "O que o porquinho-da-índia pode comer? Veja aqui!",
            "Como cuidar dos peixes do aquário no inverno?Veja aqui!"
        )

        val links = listOf(
            "https://blog.polipet.com.br/brinquedos-para-gato/",
            "https://blog.polipet.com.br/brinquedos-para-caes/",
            "https://blog.polipet.com.br/o-que-o-cachorro-nao-pode-comer/",
            "https://blog.polipet.com.br/cachorro-dormir-na-cama/",
            "https://blog.polipet.com.br/o-que-o-porquinho-da-india-pode-comer-veja-aqui/",
            "https://blog.polipet.com.br/como-cuidar-dos-peixes-do-aquario-no-inverno-veja-aqui/"
        )

        val adapter = CustomListAdapter(this,titulos, links)

        val tituloCuriosidades = findViewById<TextView>(R.id.titulo_curiosidades)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter
    }
}

