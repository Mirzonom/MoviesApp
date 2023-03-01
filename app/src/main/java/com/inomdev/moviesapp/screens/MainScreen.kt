package com.inomdev.moviesapp.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.inomdev.moviesapp.MainViewModel
import com.inomdev.moviesapp.data.models.Movies

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel) {
    val allMovies = viewModel.allMovie.observeAsState(listOf()).value
    allMovies.forEach { Log.d("checkData", "ID: ${it.id} name: ${it.name}") }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        LazyColumn() {
            items(allMovies.take(100)) { item ->
                MovieItem(item = item)
            }
        }
    }
}


@Composable
fun MovieItem(item: Movies) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = item.id.toString())
        Text(text = item.name)
    }
}