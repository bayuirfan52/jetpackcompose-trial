package test.bayu.jetpackcomposetrial.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import test.bayu.jetpackcomposetrial.route.bottom_nav.BottomNavigationItems
import test.bayu.jetpackcomposetrial.route.bottom_nav.BottomNavigationMain
import test.bayu.jetpackcomposetrial.ui.home.HomeScreen
import test.bayu.jetpackcomposetrial.ui.profile.ProfileScreen

@Composable
fun MainScreen(navController: NavHostController) {
    val innerNavController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationMain(navController = innerNavController) }
    ) { innerPadding ->
        NavHost(
            navController = innerNavController,
            modifier = Modifier.padding(innerPadding),
            startDestination = BottomNavigationItems.Home.route
        ) {
            composable(BottomNavigationItems.Home.route) {
                HomeScreen(navController)
            }
            composable(BottomNavigationItems.Profile.route) {
                ProfileScreen(navController)
            }
        }
    }
}