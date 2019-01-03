package com.nanda.dagger2example.ui.detail

import com.nanda.dagger2example.base.AbstrackBasePresenter

class DetailPresenter() : AbstrackBasePresenter<DetailView>() {

    private var view: DetailView? = null

//    @Inject
//    constructor(view: DetailView?) : this() {
//        this.view = view
//    }

    override fun setView(view: DetailView) {
        super.setView(view)
        this.view = view
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