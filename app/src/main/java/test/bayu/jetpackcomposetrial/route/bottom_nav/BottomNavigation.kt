package test.bayu.jetpackcomposetrial.route.bottom_nav

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationMain(navController: NavController) {
    val bottomNavigationItems = listOf(
        BottomNavigationItems.Home,
        BottomNavigationItems.Profile
    )

    BottomNavigation {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route
        bottomNavigationItems.forEach {
            BottomNavigationItem(
                selected = currentRoute == it.route,
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title
                    )
                },
                label = { Text(text = it.title, fontSize = 12.sp) },
                alwaysShowLabel = true,
                onClick = {
                    navController.navigate(it.route) {
                        navController.graph.startDestinationRoute?.let { screenRoute ->
                            popUpTo(screenRoute) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
            )
        }
    }
}