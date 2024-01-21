package com.example.myappjetpackcompose.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myappjetpackcompose.R


@Composable
fun Settings(
    navController: NavController,
    name: String="name"
)
{

    Column(
        modifier = Modifier
            .fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.SpaceEvenly

    ) {
        Text(text="Settings",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold)
        LazyColumn(
            modifier=Modifier
                .fillMaxHeight(0.85f)
        )
        {
            items(200)
            {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Start
                )
                {

                    Image(painter = painterResource(R.drawable.settings),
                            contentDescription = "Settings.")
                    Text(text="Setting $it",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
        }

        BottomNavigationBar(navController = navController,"$name")
    }


}
@Preview(showBackground = true)
@Composable
fun Setpre()
{
    Settings(navController = rememberNavController())
}