package com.example.magicjitcompose.componentes.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationSetup() {
    val navController = rememberNavController() // Crea el NavController
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController = navController) } // Ruta de la pantalla principal
        composable("detalles") { DetailScreen() } // Ruta de la pantalla de detalles
    }
}