package com.sembozdemir.landscape.core.di

import com.sembozdemir.landscape.main.MainActivity
import com.sembozdemir.landscape.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivity(): MainActivity

}