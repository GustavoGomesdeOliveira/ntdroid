package com.android.gustavogomesdeoliveira.natiandroidchallenge.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun movieListService() : MovieService {
        return retrofit.create(MovieService::class.java)
    }
}