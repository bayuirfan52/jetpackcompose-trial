package test.bayu.jetpackcomposetrial.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import test.bayu.jetpackcomposetrial.route.Routes
import test.bayu.jetpackcomposetrial.theme.Typography

@Composable
fun ProfileScreen(
    mainNavController: NavController
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape),
            imageVector = Icons.Rounded.Person,
            contentDescription = "Profile"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Username", style = Typography.h5)
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { mainNavController.navigate(Routes.Settings.route) },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Red,
                contentColor = Color.White,
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Click to Open Settings")
        }
    }
}