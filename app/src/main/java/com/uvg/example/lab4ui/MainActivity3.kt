package com.uvg.example.lab4ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.example.lab4ui.ui.theme.Lab4UITheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab4UITheme {
                appTercerVista()
            }
        }
    }
}

@Composable
fun settingsView(modifier: Modifier){

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appTercerVista(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(text = "Settings")
                    }

                },
                colors = topAppBarColors(
                    containerColor = Color (0xFFFFFF),
                    titleContentColor = Color.Black
                )

            )
        }
    ){
        padding ->
        settingsView(modifier = Modifier.padding(padding))
        
    }
}
