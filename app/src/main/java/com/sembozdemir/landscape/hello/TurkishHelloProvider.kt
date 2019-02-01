package com.sembozdemir.landscape.hello

import javax.inject.Singleton

@Singleton
class TurkishHelloProvider : HelloProvider {

    override fun sayHello(): String {
        return "Selamun Aleykum"
    }
}