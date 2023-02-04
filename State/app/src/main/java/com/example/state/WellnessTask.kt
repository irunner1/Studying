package com.example.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf

//data class WellnessTask(val id: Int, val label: String, var checked: MutableState<Boolean> = mutableStateOf(false))

class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false,
){
    var checked by mutableStateOf(initialChecked)
}
