package com.example.expressodemo.dataSource


interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}