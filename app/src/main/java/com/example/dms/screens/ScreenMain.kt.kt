package com.example.dms.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dms.Routes


@Composable
fun ScreenMain(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.route) {

        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }

        composable(Routes.SignUp.route) {
            SignUp(navController = navController)
        }

        composable(Routes.ForgotPassword.route) { navBackStack ->
            ForgotPassword(navController = navController)
        }

    }

}