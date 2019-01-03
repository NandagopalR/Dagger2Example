package com.nanda.dagger2example.data.di.modules

import android.content.Context
import com.nanda.dagger2example.app.AppController
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun getContext(): Context {
        return AppController.getInstance()
    }

}