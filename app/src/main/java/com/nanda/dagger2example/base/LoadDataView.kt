package com.nanda.dagger2example.base

interface LoadDataView : BaseView {

    fun showLoading()

    fun hideLoading()

    fun showError(message: String)

}