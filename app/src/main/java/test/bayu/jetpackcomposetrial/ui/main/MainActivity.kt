package test.bayu.jetpackcomposetrial.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import test.bayu.jetpackcomposetrial.theme.JetpackComposeTrialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTrialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(modifier = Modifier.padding(24.dp)) {
        AsyncImage(
            model = "https://upload-os-bbs.hoyolab.com/upload/2022/08/06/148947263/8035f28e93ffba6fdecf0a527cc78214_7659442956978110633.jpg?x-oss-process=image/resize,s_600/quality,q_80/auto-orient,0/interlace,1/format,jpg",
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(84.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "Hello $name!")
            Text(text = "Jetpack Compose Trial")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTrialTheme {
        Greeting("Android")
    }
}