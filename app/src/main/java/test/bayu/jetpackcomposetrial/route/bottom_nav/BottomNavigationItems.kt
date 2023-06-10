package test.bayu.jetpackcomposetrial.route.bottom_nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems(val route: String, val title: String, val icon: ImageVector) {
    object Home : BottomNavigationItems("home", "Home", Icons.Rounded.Home)
    object Profile : BottomNavigationItems("profle", "Profile", Icons.Rounded.Person)
}
