package com.example.android_koin_practice_app.modules.post.data.repository

import com.example.android_koin_practice_app.core.usecase.Either
import com.example.android_koin_practice_app.core.usecase.Either.Left
import com.example.android_koin_practice_app.core.usecase.Either.Right
import com.example.android_koin_practice_app.core.usecase.Failure
import com.example.android_koin_practice_app.modules.post.data.data_sources.remote.PostRemoteDataSourceRepository
import com.example.android_koin_practice_app.modules.post.domain.entity.PostEntity
import com.example.android_koin_practice_app.modules.post.domain.repository.PostRepository

class PostRepositoryImplementation(private val postRemoteDataSourceRepository: PostRemoteDataSourceRepository) :
    PostRepository {
    override suspend fun getPost(): Either<Failure, List<PostEntity>> {
        val response = postRemoteDataSourceRepository.getPostFromServer()
        if (response.isNotEmpty()) {
            response.map { data ->
                PostEntity(postId = data.id, postBody = data.body)
            }
            return Right(response)
        }
        return Left(Failure.ServerError)


    }


}