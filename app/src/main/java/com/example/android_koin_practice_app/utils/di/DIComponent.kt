package com.example.android_koin_practice_app.utils.di

import com.example.android_koin_practice_app.modules.post.presentation.manager.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


/*In this class we will inject all the dependencies.*/
class DIComponent : KoinComponent {


    val mainViewModel: MainViewModel by inject()
}