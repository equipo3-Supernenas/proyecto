package com.pmdm.fitepad.ui.features.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pmdm.fitepad.R
import com.pmdm.fitepad.ui.components.ImagenLogo
import com.pmdm.fitepad.ui.features.login.LoginScreen
import com.pmdm.fitepad.ui.theme.FitePadTheme

//funcion que dibuja la pantalla de inicio de la aplicacion

@Composable
fun StartScreen()
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
            

        }

    }

}

//funcion para hacer el preview
@Preview(showBackground = true)
@Composable
fun StartScreenPreview()
{
    FitePadTheme() {

        StartScreen()
    }

}