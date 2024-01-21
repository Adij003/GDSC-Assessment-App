package com.example.myappjetpackcompose.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myappjetpackcompose.Navigation.Navigation
import com.example.myappjetpackcompose.Navigation.Screen
import com.example.myappjetpackcompose.R

@Composable
fun Home(
    navController: NavController,
    name: String="name"
) {
    LazyColumn(

        modifier = Modifier
            .fillMaxHeight(0.85f)
            .clip(RoundedCornerShape(12.dp))
            .padding(10.dp,0.dp,10.dp,0.dp)

    ) {
        items(500)
        {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(12.dp))
                    .clickable {
                        navController.navigate("Now_Playing/" + "Music $it")
                    }


            )
            {
                Image(
                    painter = painterResource(R.drawable.musicicon),
                    contentDescription = "Music Icon",
                    modifier = Modifier
                        .clip(CircleShape)
                )
                Column(modifier = Modifier
                    .fillMaxSize())
                {


                    Text(
                        text = "Music $it",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier

                    )
                    Text(
                            text = "Artist $it",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier

                    )

                }
            }



        }
    }
}
@Composable
fun HomePage(
    navController:NavController,
    name: String="name"
) {

    Column(
        modifier=Modifier
            .clip(RoundedCornerShape(12.dp))
            .fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        ,verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        Text("Nirvana 17",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            )


        Home(navController = navController,"$name")
        BottomNavigationBar(navController = navController,name = "$name")
    }

}

@Preview(
    showBackground = true
)
@Composable
fun pre()
{
    HomePage(navController= rememberNavController())
}