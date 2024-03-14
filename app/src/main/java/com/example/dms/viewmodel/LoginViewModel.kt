package com.example.dms.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    /*
        login function
    */
    fun login(username : String, password : String) {
        // Implement your login logic using 'username' and 'password'
        Log.d("LoginViewModel", "username : $username password : $password" )
    }
}