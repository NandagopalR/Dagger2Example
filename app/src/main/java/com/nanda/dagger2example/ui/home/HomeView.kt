package com.nanda.dagger2example.ui.home

import com.nanda.dagger2example.base.BaseView

interface HomeView : BaseView {
    fun onResponse(s: String)
}