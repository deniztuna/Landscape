package com.sembozdemir.landscape.main

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.sembozdemir.landscape.R
import com.sembozdemir.landscape.core.base.BaseActivity
import com.sembozdemir.landscape.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getLayoutResId() = R.layout.activity_main

    override fun createViewModel() = obtainViewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.photos.observe(this, Observer { photos ->
            Log.d("MainActivity", photos.firstOrNull()?.urls?.full ?: "photos could not fetched")
        })

        viewModel.onPhotosNeeded()

    }
}
