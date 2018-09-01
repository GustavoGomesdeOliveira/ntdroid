package com.android.gustavogomesdeoliveira.natiandroidchallenge.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.android.gustavogomesdeoliveira.natiandroidchallenge.view.MovieListView
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        startActivity(Intent(this, MovieListActivity::class.java))
        finish()
    }
}
