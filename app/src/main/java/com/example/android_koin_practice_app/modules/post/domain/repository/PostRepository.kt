package com.example.android_koin_practice_app.modules.post.domain.repository

import com.example.android_koin_practice_app.core.usecase.Either
import com.example.android_koin_practice_app.core.usecase.Failure
import com.example.android_koin_practice_app.modules.post.domain.entity.PostEntity

interface PostRepository {


    suspend fun getPost(): Either<Failure, List<PostEntity>>
}