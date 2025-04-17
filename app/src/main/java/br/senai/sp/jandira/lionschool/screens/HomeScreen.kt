package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 50.dp),
            verticalArrangement = Arrangement.Top, // Isso coloca os elementos no topo
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.lionschool),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier
                        .size(155.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = stringResource(R.string.app_name),
                    color = Color.Blue,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp), // Este padding empurra o conteúdo para baixo
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.curse_text),
                        color = Color.Blue,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Card(
                        modifier = Modifier
                            .padding(top = 18.dp)
                            .width(95.dp)
                            .height(10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Yellow
                        )
                    ) {}
                    Text(
                        modifier = Modifier
                            .padding(top = 28.dp),
                        text = stringResource(R.string.curse_text2),
                        color = Color.Gray,
                        fontSize = 21.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        // Aqui vai o botão fixo no final da tela
        Button(
            onClick = { },
            modifier = Modifier
                .align(Alignment.BottomCenter) // Alinha o botão na parte inferior
                .height(60.dp)
                .width(200.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFDC84B)
            )
        ) {
            Text(
                text = stringResource(R.string.button_text),
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
    }
}



@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
