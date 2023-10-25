package com.example.meupetfavorito

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MelhoresVermifugos : AppCompatActivity() {

    private val vermifugos = listOf(
        Triple(
            "Vermífugo Top Dog Ouro Fino ",
            "O Vermífugo Top Dog para cães de até 2,5kg é a escolha definitiva para manter a saúde intestinal do seu fiel companheiro. Sua fórmula de última geração é meticulosamente desenvolvida para erradicar uma ampla gama de parasitas intestinais, assegurando um ambiente gastrointestinal saudável e equilibrado.\n" +
                    "\n" ,
            "https://www.polipet.com.br/produto/vermifugo-top-dog-para-caes-2-5kg-94761"
        ),
        // Adicione mais vermífugos conforme necessário
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melhores_vermifugos)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MelhoresVermifugosAdapter(vermifugos) { url ->
            openPetShopWebsite(url)
        }
    }

    private fun openPetShopWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
