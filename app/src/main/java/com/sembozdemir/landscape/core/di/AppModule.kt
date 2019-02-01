package com.sembozdemir.landscape.core.di

import android.content.Context
import com.sembozdemir.landscape.App
import com.sembozdemir.landscape.hello.HelloModule
import com.sembozdemir.landscape.network.NetworkModule
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Module(
    includes = [
        AndroidInjectionModule::class,
        ActivityBuilderModule::class,
        ViewModelModule::class,
        NetworkModule::class,
        HelloModule::class
    ]
)
class AppModule {

    @Singleton
    @Provides
    fun provideContext(app: App): Context = app.applicationContext
}