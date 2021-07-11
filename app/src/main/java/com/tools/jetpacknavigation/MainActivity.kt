package com.tools.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var navController: NavController

    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment

        navController = navHostFragment.navController

        appBarConfiguration =AppBarConfiguration(
            setOf(R.id.homeFragment,R.id.settingsFragment,R.id.notificationFragment),drawerlayout
        )

        setupActionBarWithNavController(navController,appBarConfiguration)

        bottomnav.setupWithNavController(navController)
        nav_drawer.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.Itemabout->{

                val action=MavgraphDirections.actionGlobalAboutAppFragment()
                navController.navigate(action)
                return true
            }
            else->item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
        }




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true;
    }
}