package com.android.gustavogomesdeoliveira.natiandroidchallenge.view

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Adapter
import android.widget.LinearLayout
import com.android.gustavogomesdeoliveira.natiandroidchallenge.activity.MovieListActivity
import com.android.gustavogomesdeoliveira.natiandroidchallenge.adapter.MovieListAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView


class MovieListView(val listAdapter: MovieListAdapter) : AnkoComponent<MovieListActivity> {

    override fun createView(ui: AnkoContext<MovieListActivity>) = with(ui) {
        verticalLayout {
            val list = recyclerView {
                val orientation = LinearLayoutManager.VERTICAL
                layoutManager = LinearLayoutManager(context, orientation, true)
                overScrollMode = View.OVER_SCROLL_NEVER
                adapter = listAdapter
                adapter.registerAdapterDataObserver(
                        object : RecyclerView.AdapterDataObserver() {
                            override fun onItemRangeInserted(start: Int, count: Int) {

                            }

                            override fun onItemRangeRemoved(start: Int, count: Int) {

                            }
                        })

            }.lparams(width = matchParent, height = wrapContent)
        }
    }
}