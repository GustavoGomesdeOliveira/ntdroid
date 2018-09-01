package com.android.gustavogomesdeoliveira.natiandroidchallenge.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.android.gustavogomesdeoliveira.natiandroidchallenge.api.RetrofitInitializer
import com.android.gustavogomesdeoliveira.natiandroidchallenge.model.MovieResult
import com.android.gustavogomesdeoliveira.natiandroidchallenge.util.Constants
import com.android.gustavogomesdeoliveira.natiandroidchallenge.view.MovieListView
import org.jetbrains.anko.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MovieListView().setContentView(this)
        val call = RetrofitInitializer().movieListService().listMovies(Constants().API_KEY, 1)
        call.enqueue(object: Callback<MovieResult>{
            override fun onResponse(call: Call<MovieResult>, response: Response<MovieResult>) {
                response?.body()?.let {
                    val movies: MovieResult = it
                }
            }

            override fun onFailure(call: Call<MovieResult>, t: Throwable) {

            }
        })
    }
}
