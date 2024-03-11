package com.example.dms

sealed class Routes (val route: String){
    object Login : Routes("Login")
    object SignUp : Routes("Sign Up")
    object ForgotPassword : Routes("Forgot Password")
}