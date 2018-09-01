package com.android.gustavogomesdeoliveira.natiandroidchallenge.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.android.gustavogomesdeoliveira.natiandroidchallenge.view.MovieListView
import org.jetbrains.anko.*

class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        MovieListView().setContentView(this)

    }
}
