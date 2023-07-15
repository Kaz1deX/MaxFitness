package com.example.maxfitness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maxfitness.ui.theme.MaxFitnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Hello")
        }
    }
}

@Composable
fun Greeting(str: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFAFD388))
    ) {
        Text(
            modifier = Modifier
                .padding(start = 40.dp, top = 30.dp),
            text = "MaxFitness",
            fontSize = 35.sp,
            color = Color(0xFF000000)
            )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 40.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Number 1"
            )
            Text(
                text = "Number 2"
            )
            Text(
                text = "Number 3"
            )
            Text(
                text = "Number 4"
            )
            Text(
                text = "Number 5"
            )
        }
    }
}