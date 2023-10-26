package com.example.meupetfavorito
import RacaoAdapter
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MelhoresRacoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melhores_racoes)

        val racoes = listOf(
            Quadruple(
                "Premier Shih Tzu",
                "Ração super premium formulada especialmente para Shih Tzus, com proteínas de alta qualidade, vitaminas e minerais para promover uma pele, pelagem e digestão saudáveis.",
                "https://www.polipet.com.br/produto/racao-premier-racas-especificas-shih-tzu-adultos-salmao-1-0kg-93566",
                R.drawable.racaopremier
            ),
            Quadruple(
                "Royal Canin Shih Tzu",
                "Oferece uma variedade de produtos de ração que atendem às necessidades nutricionais específicas dos Shih Tzus, com antioxidantes, vitaminas e minerais que suportam uma pele e pelagem saudáveis.",
                "https://www.polipet.com.br/produto/racao-royal-canin-shih-tzu-para-caes-adultos-1-0kg-95026",
                R.drawable.racaoroyal
            ),
            Quadruple(
                "Hills Science Diet Shih Tzu",
                "Formulada com ingredientes naturais e contém proteínas de alta qualidade, vitaminas e minerais para promover uma pele, pelagem e digestão saudáveis.",
                "https://www.polipet.com.br/produto/racao-seca-hill-s-science-diet-para-cachorros-adultos-pele-sensivel-pedacos-pequenos-6-kg-96716",
                R.drawable.racaohills
            ),
            Quadruple(
                "Special Dog Prime",
                "Ração super premium formulada para cães de todas as idades e portes, com proteínas de alta qualidade, vitaminas e minerais para promover uma pele, pelagem e digestão saudáveis.",
                "https://www.polipet.com.br/produto/racao-special-dog-prime-para-caes-adultos-de-racas-pequenas-frango-e-arroz-1-kg-94576",
                R.drawable.racaospecialprime
            ),
            Quadruple(
                "Fórmula Natural",
                "Elaborada com ingredientes naturais e contém proteínas de alta qualidade, vitaminas e minerais para promover uma pele, pelagem e digestão saudáveis.",
                "https://www.polipet.com.br/produto/racao-formula-natural-super-premium-life-cachorros-adultos-portes-mini-e-pequeno-7-0kg-91965l",
                R.drawable.racaoformulanatural
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RacaoAdapter(racoes) { url ->
            openPetShopWebsite(url)
        }
    }

    private fun openPetShopWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}

