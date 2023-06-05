package test.bayu.jetpackcomposetrial.route

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import test.bayu.jetpackcomposetrial.ui.main.MainScreen
import test.bayu.jetpackcomposetrial.ui.settings.SettingsScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Main.route) {
        composable(Routes.Main.route) {
            MainScreen(navController)
        }
        composable(Routes.Settings.route) {
            SettingsScreen(navController)
        }
    }
}