package com.nanda.dagger2example.base

abstract class AbstrackBasePresenter<V : BaseView> : BasePresenter<V> {

    private var view: V? = null

    override fun setView(view: V) {
        this.view = view
    }

    override fun destroyView() {
        view = null
    }

    override fun destroy() {
        destroyView()
    }

}