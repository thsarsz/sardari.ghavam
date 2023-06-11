package com.example.myapplication2

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun login(navController: NavHostController) {
    Column() {
        Text(text = "login")
        Button(onClick = { navController.navigate(Welcome.Route) }) {
            Text(text = "Login")
        }
    }
}
