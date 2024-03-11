package com.example.dms.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val username by mutableStateOf("")
    val password by mutableStateOf("")

    fun login() {
        // Implement your login logic using 'username' and 'password'
    }
}