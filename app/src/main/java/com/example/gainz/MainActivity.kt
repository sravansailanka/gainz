package com.example.gainz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gainz.ui.theme.GainzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GainzTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GainzApp()
                }
            }
        }
    }
}

@Composable
fun GainzApp() {
    MaterialTheme {
        Surface {
            FeedScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGainzApp() {
    GainzApp()
}