package com.example.denysenkojetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "/{anime_id}",
            arguments = listOf(
                navArgument("anime_id") {
                    type = NavType.StringType
                }
            )
        ) { entry ->
            DetailScreen(id = entry.arguments?.getString("anime_id"))
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
    LazyColumn {
        itemsIndexed(
            AnimeData().anime.value
        ) { index, item ->
            MainActivityComposable(item, navController)
        }
    }
}

@Composable
fun DetailScreen(id: String?) {
    if (id != null) {
        val anime = AnimeData().getById(id)
        Column {
            Image(
                painter = painterResource(id = anime.picture),
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
            Divider(Modifier.padding(15.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) { append("Name: ") }
                    append(anime.name)
                },
            )
            Divider(Modifier.padding(15.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) { append("Description: ") }
                    append(anime.description)
                },
            )
            Divider(Modifier.padding(15.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) { append("Native Language: ") }
                    append(anime.nativeLanguage)
                },
            )
            Divider(Modifier.padding(15.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) { append("Release year: ") }
                    append(anime.releaseYear.toString())
                },
            )
            Divider(Modifier.padding(15.dp))
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) { append("Studio: ") }
                    append(anime.studio)
                },
            )
        }
    }
}
