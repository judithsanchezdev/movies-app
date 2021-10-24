package com.example.mymovies

import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mymovies.ui.theme.MyMoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MediaItem();
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MediaItem() {
    Column() {
        Box(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(color = Color.Red)
        ) {

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(16.dp),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = "Title 1",
                style = MaterialTheme.typography.h6
            )
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

//@Preview(showBackground = true, widthDp = 400, heightDp = 200)
@Composable
fun BottonText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Hello",
            color = Color.Red,
            fontSize = 25.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Black
        )
    }
}

//@Preview(
//    showBackground = true,
//name = "android Greeting",
//    widthDp = 400,
//    heightDp = 200,
//
//)
//@Composable
//fun DefaultPreview() {
//    MyMoviesTheme {
//        Row(
//            modifier = Modifier.fillMaxSize(),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        ){
//            Greeting(
//                "Android",
//                modifier = Modifier
//                    .background(Color.Blue)
//                    .weight(2f)
//            );
//            Greeting(
//                "Android",
//                modifier = Modifier
//                    .background(Color.Cyan)
//                    .weight(2f)
//            );
//        }
//    }
//}