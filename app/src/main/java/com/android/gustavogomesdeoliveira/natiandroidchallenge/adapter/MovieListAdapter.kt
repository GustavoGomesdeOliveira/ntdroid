package com.android.gustavogomesdeoliveira.natiandroidchallenge.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.android.gustavogomesdeoliveira.natiandroidchallenge.model.MovieResult

class MovieHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

class MovieListAdapter(val movieList: MovieResult = MovieResult()) : RecyclerView.Adapter<MovieHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return movieList.results!!.count()
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}