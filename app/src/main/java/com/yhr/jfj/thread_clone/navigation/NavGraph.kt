package com.yhr.jfj.thread_clone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yhr.jfj.thread_clone.screens.AddThreads
import com.yhr.jfj.thread_clone.screens.Home
import com.yhr.jfj.thread_clone.screens.Notification
import com.yhr.jfj.thread_clone.screens.Profile
import com.yhr.jfj.thread_clone.screens.Search
import com.yhr.jfj.thread_clone.screens.Splash

@Composable
// This function sets up the navigation graph for the application
fun NavGraph(navController: NavHostController) {

    // NavHost is a container for composable destinations in your app
    NavHost(
        // navController is used to navigate between composable
        navController = navController,
        // startDestination is the route for the first screen to show when launching the app
        startDestination = Routes.Splash.routes
    ) {
        // composable function is used to create a destination in the navigation graph
        composable(
            // Routes.Splash.routes is the route for the Splash screen
            Routes.Splash.routes
        ) {
            // This is the composable function for the Splash screen
            Splash()
        }

        composable(
            // Routes.Home.routes is the route for the Home screen
            Routes.Home.routes
        ) {
            // This is the composable function for the Home screen
            Home()
        }

        composable(
            // Routes.Notification.routes is the route for the Notification screen
            Routes.Notification.routes
        ) {
            // This is the composable function for the Notification screen
            Notification()
        }

        composable(
            // Routes.Search.routes is the route for the Search screen
            Routes.Search.routes
        ) {
            // This is the composable function for the Search screen
            Search()
        }

        composable(
            // Routes.AddThreads.routes is the route for the AddThreads screen
            Routes.AddThreads.routes
        ) {
            // This is the composable function for the AddThreads screen
            AddThreads()
        }

        composable(
            // Routes.Profile.routes is the route for the Profile screen
            Routes.Profile.routes
        ) {
            // This is the composable function for the Profile screen
            Profile()
        }
    }

}