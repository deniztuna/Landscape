package com.sembozdemir.landscape.main

import android.app.Activity
import com.sembozdemir.landscape.core.di.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    @ActivityScope
    abstract fun activity(mainActivity: MainActivity): Activity
}