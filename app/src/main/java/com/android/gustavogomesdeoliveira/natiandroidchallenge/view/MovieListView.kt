package com.android.gustavogomesdeoliveira.natiandroidchallenge.view

import com.android.gustavogomesdeoliveira.natiandroidchallenge.R
import com.android.gustavogomesdeoliveira.natiandroidchallenge.activity.MovieListActivity
import org.jetbrains.anko.*

class MovieListView : AnkoComponent<MovieListActivity> {

    override fun createView(ui: AnkoContext<MovieListActivity>) = with(ui) {
        verticalLayout {
            lparams(width  = matchParent, height = matchParent)

            editText {
                id = R.id.usernameEditText
                textSize = 24f
            }.lparams(width = matchParent, height = wrapContent)
        }
    }
}
