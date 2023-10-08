package com.example.android_koin_practice_app.utils.di

import com.example.android_koin_practice_app.modules.post.data.repository.PostRepositoryImplementation
import com.example.android_koin_practice_app.modules.post.domain.repository.PostRepository
import org.koin.dsl.bind
import org.koin.dsl.module


val repositoriesDI = module {
    single { PostRepositoryImplementation(get()) } bind PostRepository::class
}