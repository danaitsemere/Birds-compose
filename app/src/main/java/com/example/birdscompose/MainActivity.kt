package com.example.birdscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.birdscompose.ui.theme.BirdsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirdsComposeTheme {
                PhotoScreen(navController = rememberNavController(),
                    screenNumber = 1,
                    imageId = R.drawable.bird, birdName="Bird"

                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PhotoScreenPreview(){
 BirdsComposeTheme {
     PhotoScreen(navController = rememberNavController(),
         screenNumber = 1,
         imageId = R.drawable.bird, birdName="Bird"

         )
 }
}