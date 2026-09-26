package mx.edu.utez.saludos4f

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import mx.edu.utez.saludos4f.ui.screens.CalculadoraScreen
import mx.edu.utez.saludos4f.ui.screens.CalculadoraViewModel
import mx.edu.utez.saludos4f.ui.theme.Saludos4FTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = CalculadoraViewModel()
        setContent {
            Saludos4FTheme {
                CalculadoraScreen(viewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Saludos4FTheme {

    }
}


@Composable
fun TextoPersonalizado(
    texto: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Magenta
){
    Text(texto,
        color = color,
        fontFamily = FontFamily.Cursive,
        fontSize = 22.em,
        lineHeight = 1.em,
        modifier = modifier
    )
}