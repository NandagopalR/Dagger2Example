package com.nanda.dagger2example.ui.home

import com.nanda.dagger2example.base.AbstrackBasePresenter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomePresenter @Inject constructor() : AbstrackBasePresenter<HomeView>() {

    private var view: HomeView? = null

    override fun setView(view: HomeView) {
        super.setView(view)
        this.view = view
    }

    fun getData() {
        if (view != null) {
            view!!.onResponse("Hello Android!!! ")
        }
    }

    override fun destroyView() {
        super.destroyView()
        this.view = null
    }

    override fun destroy() {
        super.destroy()
        destroyView()
    }

}