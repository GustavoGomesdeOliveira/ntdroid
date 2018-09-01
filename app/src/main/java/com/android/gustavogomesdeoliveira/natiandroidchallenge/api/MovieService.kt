package com.android.gustavogomesdeoliveira.natiandroidchallenge.api

import com.android.gustavogomesdeoliveira.natiandroidchallenge.model.MovieResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("3/discover/movie?")
    fun listMovies(@Query("api_key") key: String, @Query("page") page: Int) : Call<MovieResult>
}
