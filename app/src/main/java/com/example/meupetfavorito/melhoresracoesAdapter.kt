import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meupetfavorito.Quadruple
import com.example.meupetfavorito.R

class RacaoAdapter(private val racoes: List<Quadruple<String, String, String, Int>>, private val listener: (String) -> Unit) :
    RecyclerView.Adapter<RacaoAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.parentLogoIv)
        private val textViewNome: TextView = itemView.findViewById(R.id.parentTitleTv)
        private val textViewDescricao: TextView = itemView.findViewById(R.id.racaoDescriptionTv)
        private val buttonVerProduto: Button = itemView.findViewById(R.id.verProdutoBtn)

        fun bind(position: Int) {
            val (nome, descricao, _, imagem) = racoes[position]
            textViewNome.text = nome
            textViewDescricao.text = descricao
            imageView.setImageResource(imagem)

            buttonVerProduto.setOnClickListener {
                listener(racoes[position].third)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_melhoresracoes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = racoes.size
}
