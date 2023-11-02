package com.example.meupetfavorito

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Data class Vermifugo
data class Vermifugo(
    val nome: String,
    val descricao: String,
    val url: String,
    val imagemResource: Int
)

// Classe do Adapter
class MelhoresVermifugosAdapter(
    private val vermifugos: List<Vermifugo>,
    private val listener: (String) -> Unit
) : RecyclerView.Adapter<MelhoresVermifugosAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imagemPet)
        private val textViewNome: TextView = itemView.findViewById(R.id.nomeVermifugo)
        private val textViewDescricao: TextView = itemView.findViewById(R.id.descricaoVermifugo)
        private val buttonVerProduto: Button = itemView.findViewById(R.id.verProdutoBtn)

        fun bind(vermifugo: Vermifugo) {
            textViewNome.text = vermifugo.nome
            textViewDescricao.text = vermifugo.descricao
            imageView.setImageResource(vermifugo.imagemResource)

            buttonVerProduto.setOnClickListener {
                listener(vermifugo.url)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_melhoresvermifugos, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(vermifugos[position])
    }

    override fun getItemCount(): Int = vermifugos.size
}
