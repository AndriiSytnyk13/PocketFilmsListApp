package com.sytyy.example.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.sytyy.example.R
import com.sytyy.example.databinding.FragmentAllFilmsBinding

class AllFilmsFragment : Fragment(R.layout.fragment_all_films) {

    private lateinit var allFilmsBinding: FragmentAllFilmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true) // set option menu
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        allFilmsBinding = FragmentAllFilmsBinding.bind(view)
    }

    //inflate "+" button in menu
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_all_films, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    //fetch "+" click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_add_film ->{
                startActivity(Intent(requireActivity(), AddUpdateFilmActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}