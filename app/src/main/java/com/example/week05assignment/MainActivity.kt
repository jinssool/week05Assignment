package com.example.week05assignment

import MainScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week05assignment.ui.theme.Week05AssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                MainScreen(modifier = Modifier.fillMaxSize())

                Text(
                    text = "202011277 김진솔",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(12.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Week05AssignmentTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            MainScreen(modifier = Modifier.fillMaxSize())

            Text(
                text = "202011277 김진솔",
                fontSize = 14.sp,
                color = Color.DarkGray,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(12.dp)
            )
        }
    }
}