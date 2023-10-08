package com.example.android_koin_practice_app.utils.di

import com.example.android_koin_practice_app.modules.post.presentation.manager.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module


val viewModelModule = module {


    viewModel {
        MainViewModel(get())
    }
}