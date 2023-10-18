package com.example.meupetfavorito

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("História do shih tzu", R.drawable.historia, HistoriaShihTzuActivity::class.java))
        childItems1.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
        childItems1.add(ChildItem("Melhores Rações", R.drawable.racaopet, MelhoresRacoes::class.java))
        childItems1.add(ChildItem("Curiosidades", R.drawable.curiosidades, Curiosidades::class.java))

        parentList.add(ParentItem(
            "Shih tzu: deuses arteiros", R.drawable.shihtsu1,
            childItems1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("História do shih tzu", R.drawable.historia, HistoriaShihTzuActivity::class.java))
        childItem2.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
        childItem2.add(ChildItem("Melhores Rações", R.drawable.racaopet, MelhoresRacoes::class.java))
        childItem2.add(ChildItem("Curiosidades", R.drawable.curiosidades, Curiosidades::class.java))
        parentList.add(
            ParentItem(
                "Vira-Lata(SRD)",
                R.drawable.viralata,
                childItem2
            )
        )
        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("História do shih tzu", R.drawable.historia, HistoriaShihTzuActivity::class.java))
        childItem3.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
        childItem3.add(ChildItem("Melhores Rações", R.drawable.racaopet, MelhoresRacoes::class.java))
        childItem3.add(ChildItem("Curiosidades", R.drawable.curiosidades, Curiosidades::class.java))

        parentList.add(
            ParentItem(
                "Pug:na cola do dono",
                R.drawable.pug,
                childItem3
            )
        )
        val childItem4 = ArrayList<ChildItem>()
        childItem4.add(ChildItem("História do shih tzu", R.drawable.historia, HistoriaShihTzuActivity::class.java))
        childItem4.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
        childItem4.add(ChildItem("Melhores Rações", R.drawable.racaopet, MelhoresRacoes::class.java))
        childItem4.add(ChildItem("Curiosidades", R.drawable.curiosidades, Curiosidades::class.java))
        parentList.add(
            ParentItem(
                "Maltês: pelos terapêuticos",
                R.drawable.maltes,
                childItem4
            )
        )
        val childItem5 = ArrayList<ChildItem>()
        childItem5.add(ChildItem("História do shih tzu", R.drawable.historia, HistoriaShihTzuActivity::class.java))
        childItem5.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
        childItem5.add(ChildItem("Melhores Rações", R.drawable.racaopet, MelhoresRacoes::class.java))
        childItem5.add(ChildItem("Curiosidades", R.drawable.curiosidades, Curiosidades::class.java))
        parentList.add(
            ParentItem(
                "Buldogue: adorável brigão",
                R.drawable.bulldog,
                childItem5
            )
        )
    }
}
