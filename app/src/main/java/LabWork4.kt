
package com.example.helloapp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun SecondScreen() {

}

@Preview
@Composable
private fun preview() {
    SecondScreen()
    Text("Kotlin", fontSize = 28.sp)
    Text("Java", fontSize = 28.sp)
    Text("JavaScript", fontSize = 28.sp)
    Text("Python", fontSize = 28.sp)
}