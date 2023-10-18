package com.example.ejemplofragment20232.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejemplofragment20232.R
import com.example.ejemplofragment20232.databinding.FragmentListBinding
import com.example.ejemplofragment20232.ui.model.Superheroes


class ListFragment : Fragment() {

    private lateinit var listBinding: FragmentListBinding
    private var superheroesList = mutableListOf<Superheroes>()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        listBinding = FragmentListBinding.inflate(inflater, container, false)
        val root : View = listBinding.root

        loadSuperheroes()

        val superheroesRecyclerViewAdapter = SuperheroesRecyclerViewAdapter(superheroesList, onItemClicked = {onSuperheroeItemClicked(it) })
        listBinding.superheroesRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ListFragment.requireContext())
            adapter = superheroesRecyclerViewAdapter
            setHasFixedSize(false)
        }

        return root
    }

    private fun loadSuperheroes() {
        superheroesList.clear()
        var superheroes = Superheroes(id = 0,
            name = resources.getString(R.string.batman_date),
            alias = resources.getString(R.string.batman_alias),
            image = R.drawable.batman,
            powers = resources.getString(R.string.batman_powers))
        superheroesList.add(superheroes)

        superheroes = Superheroes(id = 1,
            name = resources.getString(R.string.flash_date),
            alias = resources.getString(R.string.flash_alias),
            image = R.drawable.flash,
            powers = resources.getString(R.string.flash_powers))
        superheroesList.add(superheroes)

        superheroes = Superheroes(id = 2,
            name = resources.getString(R.string.superman_date),
            alias = resources.getString(R.string.superman_alias),
            image = R.drawable.superman,
            powers = resources.getString(R.string.superman_powers))
        superheroesList.add(superheroes)

        superheroes = Superheroes(id = 3,
            name = resources.getString(R.string.wonderwoman_date),
            alias = resources.getString(R.string.wonderwoman_alias),
            image = R.drawable.wonderwoman,
            powers = resources.getString(R.string.Wonderwoman_powers))
        superheroesList.add(superheroes)
    }

    private fun onSuperheroeItemClicked(superheroes: Superheroes) {
        when(superheroes.id) {
            0 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToBatmanFragment())
            1 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToFlashFragment())
            2 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToSupermanFragment())
            3 -> findNavController().navigate(ListFragmentDirections.actionListFragmentToWonderWomanFragment())
        }
    }

}