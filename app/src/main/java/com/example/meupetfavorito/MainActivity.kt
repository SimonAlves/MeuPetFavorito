package com.example.meupetfavorito

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bottomAppBar: BottomAppBar
    private lateinit var fab: FloatingActionButton
    private val parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        bottomAppBar = findViewById(R.id.bottom_app_bar)
        fab = findViewById(R.id.fab)

        // Configurando o FloatingActionButton
        fab.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(dialogView)

            val buttonPrincipal = dialogView.findViewById<Button>(R.id.button_principal)
            val buttonCuriosidades = dialogView.findViewById<Button>(R.id.button_curiosidades)

            buttonPrincipal.setOnClickListener {
                val intentPrincipal = Intent(this, Principal::class.java)
                startActivity(intentPrincipal)
                dialog.dismiss()
            }

            buttonCuriosidades.setOnClickListener {
                val intentCuriosidades = Intent(this, Curiosidades::class.java)
                startActivity(intentCuriosidades)
                dialog.dismiss()
            }

            dialog.show()
        }


        // Adicionando os dados à lista
            val childItems1 = ArrayList<ChildItem>()
            childItems1.add(
                ChildItem(
                    "História do shih tzu",
                    R.drawable.historia,
                    HistoriaShihTzuActivity::class.java
                )
            )
            childItems1.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
            childItems1.add(
                ChildItem(
                    "Melhores Rações",
                    R.drawable.racaopet,
                    MelhoresRacoes::class.java
                )
            )
            childItems1.add(
                ChildItem(
                    "Curiosidades",
                    R.drawable.curiosidades,
                    Curiosidades::class.java
                )
            )

            parentList.add(
                ParentItem(
                    "Shih tzu: deuses arteiros", R.drawable.shihtsu1,
                    childItems1
                )
            )

            val childItem2 = ArrayList<ChildItem>()
            childItem2.add(
                ChildItem(
                    "História do shih tzu",
                    R.drawable.historia,
                    HistoriaShihTzuActivity::class.java
                )
            )
            childItem2.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
            childItem2.add(
                ChildItem(
                    "Melhores Rações",
                    R.drawable.racaopet,
                    MelhoresRacoes::class.java
                )
            )
            childItem2.add(
                ChildItem(
                    "Curiosidades",
                    R.drawable.curiosidades,
                    Curiosidades::class.java
                )
            )
            parentList.add(
                ParentItem(
                    "Vira-Lata(SRD)",
                    R.drawable.viralata,
                    childItem2
                )
            )

            val childItem3 = ArrayList<ChildItem>()
            childItem3.add(
                ChildItem(
                    "História do shih tzu",
                    R.drawable.historia,
                    HistoriaShihTzuActivity::class.java
                )
            )
            childItem3.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
            childItem3.add(
                ChildItem(
                    "Melhores Rações",
                    R.drawable.racaopet,
                    MelhoresRacoes::class.java
                )
            )
            childItem3.add(
                ChildItem(
                    "Curiosidades",
                    R.drawable.curiosidades,
                    Curiosidades::class.java
                )
            )

            parentList.add(
                ParentItem(
                    "Pug:na cola do dono",
                    R.drawable.pug,
                    childItem3
                )
            )

            val childItem4 = ArrayList<ChildItem>()
            childItem4.add(
                ChildItem(
                    "História do shih tzu",
                    R.drawable.historia,
                    HistoriaShihTzuActivity::class.java
                )
            )
            childItem4.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
            childItem4.add(
                ChildItem(
                    "Melhores Rações",
                    R.drawable.racaopet,
                    MelhoresRacoes::class.java
                )
            )
            childItem4.add(
                ChildItem(
                    "Curiosidades",
                    R.drawable.curiosidades,
                    Curiosidades::class.java
                )
            )
            parentList.add(
                ParentItem(
                    "Maltês: pelos terapêuticos",
                    R.drawable.maltes,
                    childItem4
                )
            )

            val childItem5 = ArrayList<ChildItem>()
            childItem5.add(
                ChildItem(
                    "História do shih tzu",
                    R.drawable.historia,
                    HistoriaShihTzuActivity::class.java
                )
            )
            childItem5.add(ChildItem("Idade do Pet", R.drawable.idade, IdadeShihtsu::class.java))
            childItem5.add(
                ChildItem(
                    "Melhores Rações",
                    R.drawable.racaopet,
                    MelhoresRacoes::class.java
                )
            )
            childItem5.add(
                ChildItem(
                    "Curiosidades",
                    R.drawable.curiosidades,
                    Curiosidades::class.java
                )
            )
            parentList.add(
                ParentItem(
                    "Buldogue: adorável brigão",
                    R.drawable.bulldog,
                    childItem5
                )
            )

            val adapter = ParentAdapter(parentList)
            recyclerView.adapter = adapter

            // Adicione o item "Escolha Pet" ao BottomAppBar
            bottomAppBar.replaceMenu(R.menu.menu_bottom_app_bar)

            // Trate o clique no item "Escolha Pet"
            bottomAppBar.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_escolha_pet -> {
                        val intent = Intent(this, EscolhaPetActivity::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false
                }
            }
        }
    }

