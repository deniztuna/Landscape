package com.sembozdemir.landscape.network


data class Photo(
    val id: String,
    val width: Int,
    val height: Int,
    val color: String,
    val urls: Urls
)

data class Urls(
    val raw: String,
    val full: String,
    val regular: String,
    val small: String,
    val thumb: String
)
