package com.example.myappjetpackcompose.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.myappjetpackcompose.Navigation.Screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myappjetpackcompose.Navigation.Navigation
import com.example.myappjetpackcompose.R

val sizeofbutton =80.dp


@Composable
fun BottomNavigationBar(
    navController: NavController
    ,name: String="name"
) {

    Row(verticalAlignment = Alignment.Bottom,

            modifier = Modifier
                .clip(CircleShape)
                .fillMaxWidth()
                .clip(CircleShape)
                .border(4.dp, Color.Black, CircleShape )
        ,horizontalArrangement = Arrangement.SpaceEvenly
    )
    {
        Column(
            modifier = Modifier
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Home Icon",
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                        .clickable {

                          navController.navigate("Home_Page/"+"$name")
                        }
                )
            Text(
                text = "Home",
                fontSize = 14.sp,
                fontWeight=FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        }
        Column(
            modifier = Modifier

            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.musicicon),
                contentDescription = "Music Icon",
                modifier = Modifier
                    .clickable {
                        navController.navigate("Now_Playing/"+"$name")
                    }
            )
            Text(
                text = "Now Playing",
                fontSize = 14.sp,
                fontWeight=FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        }
        Column(
            modifier = Modifier

            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.settings),
                contentDescription = "Settings Icon",
                modifier = Modifier
                    .clip(CircleShape)
                    .clickable {
                        navController.navigate("Settings/"+"$name")
                    }

            )
            Text(
                text = "Settings",
                fontSize = 14.sp,
                fontWeight=FontWeight.ExtraBold,
                modifier = Modifier
                    .clickable {
                        navController.navigate(route = Screen.Settings.route)
                    }
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        }

    }
    }





@Preview(showBackground = true)
@Composable
fun impo()
{
    BottomNavigationBar(navController = rememberNavController())
}

















