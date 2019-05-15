package com.gathergood.calum.polymorph

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        setupNavigation()

    }

    private fun setupNavigation() {
        val navController = findNavController(R.id.main_fragment)
        bottomNavigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp() =
        findNavController(R.id.main_fragment).navigateUp()

}
