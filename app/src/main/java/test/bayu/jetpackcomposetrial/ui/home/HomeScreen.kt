package test.bayu.jetpackcomposetrial.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(mainNavController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Home Screen")
    }
}