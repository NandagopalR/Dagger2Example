package com.nanda.dagger2example.data.di.componants

import com.nanda.dagger2example.app.AppController
import com.nanda.dagger2example.data.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class, AppModule::class
    )
)
interface AppComponant : AndroidInjector<AppController> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AppController>() {

    }

}