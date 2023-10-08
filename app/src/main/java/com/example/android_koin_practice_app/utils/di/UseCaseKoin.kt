package com.example.android_koin_practice_app.utils.di

import com.example.android_koin_practice_app.modules.post.data.repository.PostRepositoryImplementation
import com.example.android_koin_practice_app.modules.post.domain.repository.PostRepository
import com.example.android_koin_practice_app.modules.post.domain.use_case.GetPostUseCase
import org.koin.dsl.bind
import org.koin.dsl.module


val useCaseDI = module {

    single { GetPostUseCase(get()) }

}