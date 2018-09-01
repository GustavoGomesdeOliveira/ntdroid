package com.android.gustavogomesdeoliveira.natiandroidchallenge.model

import com.google.gson.annotations.SerializedName

class Movie {

    @SerializedName("original_title")
    lateinit var title: String
    @SerializedName("poster_path")
    lateinit var posterPath: String
    @SerializedName("overview")
    lateinit var description: String
}

class MovieResult {

    val results: List<Movie>? = null
}