package com.example.meupetfavorito

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val childList: List<ChildItem>, private val context: Context) :
    RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo: ImageView = itemView.findViewById(R.id.childLogoIv)
        val title: TextView = itemView.findViewById(R.id.childTitleTv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.logo.setImageResource(childList[position].logo)
        holder.title.text = childList[position].title


        holder.itemView.setOnClickListener {
            val intent = Intent(context, getActivityByTitle(childList[position].title))
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return childList.size
    }

    private fun getActivityByTitle(title: String): Class<out AppCompatActivity> {
        return when (title) {
            "História do shih tzu" -> HistoriaShihTzuActivity::class.java
            "Idade do Pet" -> IdadeShihtsu::class.java
            "Melhores Rações" -> MelhoresRacoes::class.java
            "Curiosidades" -> Curiosidades::class.java
            "Vermifugos" -> Vermifugos::class.java
            else -> DefaultActivity::class.java
        }
    }
}





