package br.senai.sp.jandira.lionschool.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CurseScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(11.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.lionschool),
                    contentDescription = stringResource(R.string.logo),
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = stringResource(R.string.lion_name),
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .background(Color(0xFFF3F3F3), shape = RoundedCornerShape(12.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = stringResource(R.string.search),
                        color = Color.Gray,
                        fontSize = 16.sp
                    )

                    Image(
                        painter = painterResource(R.drawable.pesquisar),
                        contentDescription = stringResource(R.string.search),
                        modifier = Modifier.size(30.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp),  // Espaço entre o ícone e o texto
                verticalAlignment = Alignment.CenterVertically  // Centraliza o ícone e o texto verticalmente
            ) {
                Image(
                    painter = painterResource(R.drawable.lista),
                    contentDescription = stringResource(R.string.courses),
                    modifier = Modifier.size(36.dp)
                )

                Text(
                    text = stringResource(R.string.courses),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
            }

            Spacer(modifier = Modifier .height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(209.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFF3347B0), Color(0xFFCFD4EA))
                        ),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 10.dp, top = 10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.programano),
                            contentDescription = stringResource(R.string.ds),
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = stringResource(R.string.ds),
                            color = colorResource(R.color.yellow),
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 56.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        text = stringResource(R.string.devsistema)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        color = Color.White,
                        fontSize = 15.sp,
                        text = stringResource(R.string.dev_text)
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.relogio),
                            contentDescription = "Relógio",
                            tint = Color.Yellow,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = stringResource(R.string.semestre),
                            color = Color.Yellow,
                            fontSize = 12.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(209.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFF3347B0), Color(0xFFCFD4EA))
                        ),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 10.dp, top = 10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ele),
                            contentDescription = stringResource(R.string.rds),
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = stringResource(R.string.rds),
                            color = colorResource(R.color.yellow),
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 56.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        text = stringResource(R.string.rede)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        color = Color.White,
                        fontSize = 15.sp,
                        text = stringResource(R.string.rds_text)
                    )
                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.relogio),
                            contentDescription = "Relógio",
                            tint = Color.Yellow,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = stringResource(R.string.semestre),
                            color = Color.Yellow,
                            fontSize = 12.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp)) // Espaço entre os cards


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(209.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFF5A659F), Color(0xFF9FA9E1))
                        ),
                                shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 10.dp, top = 10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.programano),
                            contentDescription = stringResource(R.string.ele),
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 8.dp)
                        )
                        Text(
                            text = stringResource(R.string.ele),
                            color = colorResource(R.color.yellow),
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 56.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        text = stringResource(R.string.eletro )
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        color = Color.White,
                        fontSize = 15.sp,
                        text = stringResource(R.string.ele_text)
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.relogio),
                            contentDescription = "Relógio",
                            tint = Color.Yellow,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = stringResource(R.string.semestre),
                            color = Color.Yellow,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}




@Preview
@Composable
private fun CurseScreenPreview() {
    CurseScreen()
}
