package mx.edu.utez.saludos4f.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import mx.edu.utez.saludos4f.ui.theme.Saludos4FTheme

@Composable
fun CalculadoraScreen(viewModel: CalculadoraViewModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            "Bienvenidos a la calcu",
            style = MaterialTheme.typography.titleMedium
        )
        OutlinedTextField(
            viewModel.texto,
            { viewModel.onTextChange(it) }
        )
        Row(){
            Button({viewModel.operacion("+")}){Text("+")}
            Button({viewModel.operacion("-")}){Text("-")}
            Button({viewModel.operacion("/")}){Text("/")}
            Button({viewModel.operacion("*")}){Text("*")}
        }
        Row(){
            Button(
                {viewModel.escribirNumero("5")}
            ){Text("5")}
            Button(
                {viewModel.escribirNumero("9")}
            ){Text("9")}
        }
        Row(Modifier.fillMaxWidth()){
            Button(
                {viewModel.resultado()},
                Modifier.fillMaxWidth(),
                colors = ButtonColors(
                    Color.Blue,
                    Color.White,
                    Color.Red,
                    Color.Green
                )
            ){Text("=", fontSize = 5.em)}
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    val viewModel = CalculadoraViewModel()
    Saludos4FTheme() {
        CalculadoraScreen(viewModel)
    }
}