package com.sembozdemir.landscape.main

import android.os.Bundle
import androidx.lifecycle.Observer
import com.sembozdemir.landscape.R
import com.sembozdemir.landscape.core.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    override fun getLayoutResId() = R.layout.activity_main

    override fun createViewModel() = obtainViewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainButtonSayHello.setOnClickListener {
            viewModel.onSayHelloButtonClick()
        }

        viewModel.helloText.observe(this, Observer { text ->
            mainTextViewHello.text = text
        })

    }
}
