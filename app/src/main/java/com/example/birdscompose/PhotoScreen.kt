package com.example.birdscompose

import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.content.contentReceiver
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PhotoScreen(
    navController: NavController,
    screenNumber:Int,
    imageId:Int,
    birdName:String
){

Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Top){
    Image(painter = painterResource(id=R.drawable.bird),
    contentDescription = "a picture of a white bird",
        modifier=Modifier.fillMaxWidth().fillMaxHeight(0.65f),
        contentScale = ContentScale.Fit

    )

    Text(text = birdName, modifier = Modifier.padding(24.dp), fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic
    )
    Spacer(modifier=Modifier.height(32.dp))
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement =Arrangement.SpaceBetween ) {
        IconButton(onClick = {/*TODO*/}) {
            Icon(painter = painterResource(id=R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "back arrow", tint = Color.Magenta
            )
        }
        IconButton(onClick = {/*TODO*/}) {
            Icon(painter = painterResource(id=R.drawable.baseline_arrow_forward_ios_24),
                contentDescription = "forward arrow"
            )
        }
    }

}


}


