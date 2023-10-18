package com.example.ejemplofragment20232.ui.list


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplofragment20232.R
import com.example.ejemplofragment20232.databinding.CardViewItemSuperheroesBinding
import com.example.ejemplofragment20232.ui.model.Superheroes

class SuperheroesRecyclerViewAdapter (
    private val superheroesList: MutableList<Superheroes>,
    private val onItemClicked: (Superheroes) -> Unit
): RecyclerView.Adapter<SuperheroesRecyclerViewAdapter.SuperHeroeViewHolder> (){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_view_item_superheroes, parent,false)
        return SuperHeroeViewHolder(itemView)
    }

    override fun getItemCount(): Int = superheroesList.size

    override fun onBindViewHolder(holder: SuperHeroeViewHolder, position: Int) {
        val superheroes = superheroesList[position]
        holder.bingSuperheroe(superheroes)
        holder.itemView.setOnClickListener {onItemClicked(superheroes)}
    }

    class SuperHeroeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = CardViewItemSuperheroesBinding.bind(itemView)

        fun bingSuperheroe(superheroes: Superheroes) {
            with(binding) {
                nameTextView.text = superheroes.name
                superheroeImageView.setImageResource(superheroes.image)
            }
        }

    }

}