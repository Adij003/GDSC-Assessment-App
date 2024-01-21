package com.example.myappjetpackcompose.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappjetpackcompose.R

@Composable
fun NP(
    navController: NavController,
   name: String="name"
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Text(text="Now Playing",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,

            )
        Column(
            modifier = Modifier
                .fillMaxHeight(0.85f)
                .fillMaxWidth()
            , horizontalAlignment = Alignment.CenterHorizontally
            //, verticalArrangement = Arrangement.Bottom
        )
        {

            Image(
                painter = painterResource(R.drawable.musicicon),
                contentDescription = "Music Icon",
                modifier = Modifier
                .fillMaxSize(0.8f)

            )
            Text(
                text = "$name",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

Spacer(modifier = Modifier.fillMaxHeight(0.05f))
        BottomNavigationBar(navController = navController, name = "$name")

    }
}


@Preview(showBackground = true)
@Composable
fun preu(){
    NP(navController = rememberNavController(),"hini")
}