package com.example.myappjetpackcompose.Navigation

sealed class Screen(val route :String)
{
    object HomePage: Screen(route = "Home_Page/{name}")
    object NowPlaying : Screen(route="Now_Playing/{name}")
    object Settings: Screen(route = "Settings/{name}")


}