package com.example.denysenkojetpackcompose.model

data class Anime(
    val id: String,
    val name: String,
    val studio: String,
    val picture: Int,
    val releaseYear: Int,
    val nativeLanguage: String,
    val description: String
)
