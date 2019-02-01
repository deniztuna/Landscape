package com.sembozdemir.landscape.core.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel(), CoroutineScope {

    private val asyncJob = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + asyncJob

    override fun onCleared() {
        asyncJob.cancel()
        super.onCleared()
    }
}