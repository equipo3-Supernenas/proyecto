package com.pmdm.fitepad.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pmdm.fitepad.R

//Esto es un plagio descarado de mi ejercicio de ImagenContacto
@Composable
fun ImagenLogo(
    modifier: Modifier,
    foto : ImageBitmap?,
    anchoBorde : Dp = 4.dp
)
{
    //Seguramente haya que meter un remember aqui en el futuro
    val painterFoto : Painter

    // Define la forma del hexágono en 4 líneas
    val hexagono = GenericShape { size, _ ->
        moveTo(size.width * 0.5f, 0f)
        lineTo(size.width, size.height * 0.25f)
        lineTo(size.width, size.height * 0.75f)
        lineTo(size.width * 0.5f, size.height)
        lineTo(0f, size.height * 0.75f)
        lineTo(0f, size.height * 0.25f)
    }

    if(foto != null)
    {
        painterFoto = BitmapPainter(foto)
    }
    else //en caso de ser nulo imagen por defecto
    {
        painterFoto = painterResource(R.drawable.ic_launcher_foreground)

    }

    //Definimos el objeto imagen aqui
    Image(
        painterFoto,
        "Imagen de logo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(hexagono)
            .aspectRatio(1f)
            .background(MaterialTheme.colorScheme.surface)
            .border( width = anchoBorde,color = MaterialTheme.colorScheme.inversePrimary, shape = CircleShape)

    )

}