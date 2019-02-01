package com.sembozdemir.landscape.main

import androidx.lifecycle.MutableLiveData
import com.sembozdemir.landscape.core.base.BaseViewModel
import com.sembozdemir.landscape.hello.HelloProvider
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val helloProvider: HelloProvider
) : BaseViewModel() {

    val helloText: MutableLiveData<String> = MutableLiveData()

    fun onSayHelloButtonClick() {
        helloText.value = helloProvider.sayHello()
    }

}