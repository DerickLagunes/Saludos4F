package mx.edu.utez.saludos4f.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculadoraViewModel: ViewModel() {

    //Variables
    var num1 by mutableStateOf("")
    var num2 by mutableStateOf("")
    var operador by mutableStateOf("")

    var texto by mutableStateOf("")

    //funciones que hacen los botones +, -, /, *
    fun operacion(operacion: String){
        num1 = texto
        texto = ""
        when(operacion){
            "+" -> operador = "+"
            "-" -> operador = "-"
            "/" -> operador = "/"
            "*" -> operador = "*"
        }
    }

    fun resultado(){
        num2 = texto
        when (operador){
            "+" -> texto = (num1.toDouble() + num2.toDouble()).toString()
            "-" -> texto = (num1.toDouble() - num2.toDouble()).toString()
            "/" -> texto = (num1.toDouble() / num2.toDouble()).toString()
            "*" -> texto = (num1.toDouble() * num2.toDouble()).toString()
        }
    }

    fun escribirNumero(num: String){
        onTextChange(num)
    }

    //función que hace el input
    fun onTextChange(text:String){
        texto += text
    }

}