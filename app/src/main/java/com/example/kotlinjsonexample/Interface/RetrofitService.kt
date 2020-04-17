package com.example.kotlinjsonexample.Interface

import com.example.kotlinjsonexample.Model.Movie
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitService {
    @GET(value = "marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}