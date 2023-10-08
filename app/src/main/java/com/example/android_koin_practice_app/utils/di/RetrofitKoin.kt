package com.example.android_koin_practice_app.utils.di

import com.example.android_koin_practice_app.modules.post.data.data_sources.remote.PostRemoteDataSourceRepository
import com.example.android_koin_practice_app.modules.post.data.data_sources.remote.PostRemoteDataSourceRepositoryImplementation
import com.example.android_koin_practice_app.utils.networking.provideApiService
import com.example.android_koin_practice_app.utils.networking.provideMoshi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module


val retrofitDiModule = module {
    single { provideMoshi() }
    single { provideApiService(get()) }
    factory {
        PostRemoteDataSourceRepositoryImplementation(get())
    } bind PostRemoteDataSourceRepository::class

}


