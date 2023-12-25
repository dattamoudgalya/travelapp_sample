package com.example.travel

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Toast.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.travel.R.color.blue
import com.example.travel.R.color.purple_500
import com.example.travel.ui.theme.TravelTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val next= findViewById<ImageButton>(R.id.imageButton)
        val previous= findViewById<ImageButton>(R.id.imageButton4)
        val linear=findViewById<LinearLayout>(R.id.linear)
        next.setOnClickListener{
//
            Toast.makeText(next.getContext(), "Thanks for downloading", Toast.LENGTH_SHORT).show();
            linear.setBackgroundColor(purple_500)
        }
        previous.setOnClickListener{
//
            Toast.makeText(next.getContext(), "Thanks for downloading", Toast.LENGTH_SHORT).show();
            linear.setBackgroundColor(blue)
        }
//        setContent {
//            TravelTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TravelTheme {
//        Greeting("Android")
//    }
    }
}

