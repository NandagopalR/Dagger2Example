package com.nanda.dagger2example.data.di.componants

import com.nanda.dagger2example.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBuilderModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): HomeActivity

}