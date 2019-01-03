package com.nanda.dagger2example.base

interface BasePresenter<V : BaseView> {

    fun setView(view: V)

    fun destroyView()

    fun destroy()

}