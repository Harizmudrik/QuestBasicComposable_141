package com.example.composablelayout_141

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composablelayout_141.ui.theme.ComposableLayout_141Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableLayout_141Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Login", style = TextStyle(fontSize = 50.sp, fontWeight = FontWeight.Bold))
        Text(text = "Ini adalah halaman login")
        Image(
            painter = painterResource(id = R.drawable.logouuu),
            contentDescription = null,
            modifier = modifier
                .padding(top = 30.dp)
                .size(200.dp)
        )
        Text(
            text = "Nama",
            style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)
        )
        Text( text = "Muhammad Hariz Mudrik",
            style = TextStyle(fontSize = 17.sp, color = Color.Red)

        )
        Text(
            text = "20220140141",
            style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)
        )
        Image(
            painter = painterResource(id = R.drawable.selfphoto),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(250.dp)
                .padding(top = 40.dp)
                .clip(RoundedCornerShape(100.dp))
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableLayout_141Theme {
        Greeting("Android")
    }
}