package com.example.helloapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxSize())
            {
                Text("Kotlin", fontSize = 28.sp)
                Text("Java", fontSize = 28.sp)
                Text("JavaScript", fontSize = 28.sp)
                Text("Python", fontSize = 28.sp)
            }
        }
    }
}

