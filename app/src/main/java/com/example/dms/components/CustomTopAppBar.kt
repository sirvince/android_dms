package com.example.dms.components

import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(navHostController: NavHostController, title: String, showBackIcon : Boolean){
    TopAppBar(
        title = { Text(text = title) },
//        navigationIcon = (if (showBackIcon && navHostController.previousBackStackEntry != null){
//            {
//                IconButton(onClick = {navHostController.navigateUp()}) {
//                    Icon(
//                        imageVector = Icons.Filled.ArrowBack,
//                        contentDescription = "Back"
//                    )
//
//                }
//            }
//        }else{
//            null
//        })!!

        navigationIcon =
        {
            IconButton(onClick = {navHostController.navigateUp()}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back"
                )

            }
        }


    )
}