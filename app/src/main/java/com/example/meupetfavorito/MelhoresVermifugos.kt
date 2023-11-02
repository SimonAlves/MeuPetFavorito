package com.example.meupetfavorito
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MelhoresVermifugos : AppCompatActivity() {

    private val vermifugos = listOf(
        Vermifugo(
            "Vermífugo Top Dog Ouro Fino",
            "O Vermífugo Top Dog para cães de até 2,5kg é a escolha definitiva para manter a saúde intestinal do seu fiel companheiro. Sua fórmula de última geração é meticulosamente desenvolvida para erradicar uma ampla gama de parasitas intestinais, assegurando um ambiente gastrointestinal saudável e equilibrado.\n\n",
            "https://www.polipet.com.br/produto/vermifugo-top-dog-para-caes-2-5kg-94761",
            R.drawable.iconvermifugo
        ),
        Vermifugo(
            "Vermífugo Endogard Para Cães De Até 10kg (2 Unidades)",
            "O Vermífugo Endogard é uma solução confiável para manter a saúde intestinal do seu cão de até 10kg. Essas duas unidades foram formuladas cuidadosamente para eliminar uma ampla gama de parasitas intestinais, garantindo um ambiente gastrointestinal saudável e equilibrado.\n\n",
            "https://www.polipet.com.br/produto/vermifugo-endogard-para-caes-de-ate-10kg-2un-92851",
            R.drawable.endogard
        )
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
