package com.pmdm.fitepad.ui.features.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.fitepad.R
import com.pmdm.fitepad.ui.components.ImagenLogo
import com.pmdm.fitepad.ui.theme.FitePadTheme

@Composable
fun LoginScreen()
{
    //Es una caja alineada al centro para estar siempre los elementos en el centro
    //de la pantalla
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            //Ocupamos el maximo posible de la pantalla
            .fillMaxSize()
            //Le ponemos el fondo de la aplicacion
            .paint(
                painter = painterResource(id = R.drawable.fondoinicio),
                contentScale = ContentScale.Crop
            )
    )
    {
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            ImagenLogo(
                modifier = Modifier,
                foto = null
            )
            FilledTonalButton(
                onClick = {} //Aqui debe de ir el metodo que lleve a crear cuenta

            )
            {
                Text(
                    text = "Crear Cuenta",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
            }
            OutlinedButton(
                onClick = {} //Aqui debe ir el metodo que lleve a Iniciar sesion
            )
            {
                Text(
                    text = "Iniciar Sesion",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
            }


        }

    }

}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview()
{
    FitePadTheme() {

        LoginScreen()
    }

}