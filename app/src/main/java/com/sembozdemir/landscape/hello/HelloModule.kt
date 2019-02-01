package com.sembozdemir.landscape.hello

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HelloModule {

    @Provides
    @Singleton
    fun provideHelloProvider(): HelloProvider = SpanishHelloProvider()

}