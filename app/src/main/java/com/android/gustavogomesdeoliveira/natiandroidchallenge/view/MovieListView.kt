package com.android.gustavogomesdeoliveira.natiandroidchallenge.view

import com.android.gustavogomesdeoliveira.natiandroidchallenge.R
import com.android.gustavogomesdeoliveira.natiandroidchallenge.activity.MovieListActivity
import org.jetbrains.anko.*


class MovieListView : AnkoComponent<MovieListActivity> {
    override fun createView(ui: AnkoContext<MovieListActivity>) = with(ui) {
        frameLayout {
            val textField = editText {
                hint = "Teste"
            }.lparams(width = matchParent) {
                margin = dip(12)
                topMargin = dip(30)
            }
        }
    }
}