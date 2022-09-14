package com.dzak.presentasiviewmodel

import androidx.lifecycle.ViewModel

class IniViewModel : ViewModel(){
    var result : Double = 0.0

    var phi = 3.14

    fun hitung(ruas : String) {
        result = 3.14 * ruas.toDouble() * ruas.toDouble()
    }
}