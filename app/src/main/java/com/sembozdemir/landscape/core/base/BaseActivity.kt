package com.sembozdemir.landscape.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.sembozdemir.landscape.BR
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<DB : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: VM

    private lateinit var binding: DB

    @LayoutRes
    abstract fun getLayoutResId(): Int

    abstract fun createViewModel(): VM

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutResId())
        viewModel = createViewModel()
        binding.setVariable(BR.viewModel, viewModel)
        binding.setLifecycleOwner(this)
    }

    protected inline fun <reified T : ViewModel> obtainViewModel(): T {
        return ViewModelProviders.of(this, viewModelFactory).get(T::class.java)
    }
}