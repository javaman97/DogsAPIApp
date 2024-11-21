package com.aman.dogsapiapp.ui.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.aman.dogsapiapp.R
import com.aman.dogsapiapp.databinding.ActivityMainBinding
import com.aman.dogsapiapp.utils.extensions.closeCheckable
import com.aman.dogsapiapp.utils.extensions.openCheckable

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 //    enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        with(binding.bottomNavView){
            closeCheckable()
            background = null

            menu.getItem(1).isEnabled = false

            itemIconTintList = null
        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
            NavigationUI.setupWithNavController(binding.bottomNavView, navHostFragment.navController)


        navHostFragment.navController.addOnDestinationChangedListener{ controller, dest, args ->

            if(dest.id == R.id.favoritesFragment || dest.id == R.id.bookmarkFragment){
                with(binding.bottomNavView){
                    openCheckable()
                }
            }
        }

        binding.fab.setOnClickListener {
            binding.bottomNavView.closeCheckable()
            navHostFragment.navController.navigate(R.id.toDogFragment)
        }
    }
}