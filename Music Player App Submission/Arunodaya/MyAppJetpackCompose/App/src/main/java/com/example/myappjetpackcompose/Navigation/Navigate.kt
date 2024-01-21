package com.example.myappjetpackcompose.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myappjetpackcompose.Components.HomePage
import com.example.myappjetpackcompose.Components.NP
import com.example.myappjetpackcompose.Components.Settings

@Composable
fun Navigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomePage.route)
    {
        composable(route = "Home_Page/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "None Playing."
                }
            ))
        {
                entry ->
            entry.arguments?.getString("name")?.let { HomePage(navController, name = it) }

        }



        composable(route = "Now_Playing/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "No Song playing currently."
                }
            ))
        {
                entry ->
            entry.arguments?.getString("name")?.let { NP(navController, name = it) }

        }
        composable(route = "Settings/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "No Song playing currently."
                }
            ))
        {
                entry ->
            entry.arguments?.getString("name")?.let { Settings(navController, name = it) }

        }



    }


}
