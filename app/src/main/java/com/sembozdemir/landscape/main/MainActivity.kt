package com.sembozdemir.landscape.main

import android.os.Bundle
import com.sembozdemir.landscape.R
import com.sembozdemir.landscape.core.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {

    override fun getLayoutResId() = R.layout.activity_main

    override fun createViewModel() = obtainViewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
