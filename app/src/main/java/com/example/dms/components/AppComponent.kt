package com.example.dms.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun TextHeaderComponent(text : String){
    Text(
        text = text,
        style = TextStyle(
            fontSize = 40.sp,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center
        )
    )
}



@Composable
fun TextLabelComponent(text : String){
    Text(
        text = text,
        style = TextStyle(
            fontSize = 40.sp,
            fontFamily = FontFamily.Default
        )
    )
}
