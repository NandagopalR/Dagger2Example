package com.nanda.dagger2example.app

import com.nanda.dagger2example.data.di.componants.DaggerAppComponant
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppController : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out AppController> {
        return DaggerAppComponant.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun getInstance(): AppController {
            return AppController()
        }
    }

}