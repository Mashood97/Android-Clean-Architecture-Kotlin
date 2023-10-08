package com.example.android_koin_practice_app.modules.post.domain.use_case

import com.example.android_koin_practice_app.core.usecase.Either
import com.example.android_koin_practice_app.core.usecase.Failure
import com.example.android_koin_practice_app.core.usecase.UseCase
import com.example.android_koin_practice_app.modules.post.domain.entity.PostEntity
import com.example.android_koin_practice_app.modules.post.domain.repository.PostRepository

class GetPostUseCase(private val postRepository: PostRepository) :
    UseCase<List<PostEntity>, Unit>() {
    override suspend fun run(params: Unit): Either<Failure, List<PostEntity>> {
        return postRepository.getPost()
    }
}