package com.example.eventoapp.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("EventoApp") })
        }
    ) { padding ->
        Text(
            text = "Bienvenido a EventoApp 🎉",
            modifier = androidx.compose.ui.Modifier.padding(padding)
        )
    }
}
