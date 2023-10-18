package com.example.ejemplofragment20232.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemplofragment20232.R
import com.example.ejemplofragment20232.databinding.ActivityMainBinding
import com.example.ejemplofragment20232.ui.bottom.BottonNavigationActivity
import com.example.ejemplofragment20232.ui.masterdetail.MasterDetailActivity
import com.example.ejemplofragment20232.ui.navdrawer.NavigationDrawerActivity
import com.example.ejemplofragment20232.ui.tabbed.TabbedActivity

class MainActivity : AppCompatActivity() {

    private  lateinit var fragmentBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_EjemploFragment20232)
        super.onCreate(savedInstanceState)
        fragmentBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = fragmentBinding.root
        setContentView(view)

        fragmentBinding.bottomNavigationButton.setOnClickListener {
            val intent = Intent(this,BottonNavigationActivity::class.java)
            startActivity(intent)
        }

        fragmentBinding.swipeTabsButton.setOnClickListener {
            val intent = Intent(this,TabbedActivity::class.java)
            startActivity(intent)
        }

        fragmentBinding.navigationDrawerButton.setOnClickListener {
            val intent = Intent(this,NavigationDrawerActivity::class.java)
            startActivity(intent)
        }

        fragmentBinding.masterDetailButton.setOnClickListener {
            val intent = Intent(this,MasterDetailActivity::class.java)
            startActivity(intent)
        }

    }
}