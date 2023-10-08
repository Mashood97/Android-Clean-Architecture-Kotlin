package com.example.android_koin_practice_app.modules.post.data.data_sources.remote

import com.example.android_koin_practice_app.modules.post.data.model.PostModel
import com.example.android_koin_practice_app.utils.networking.ApiService
import retrofit2.Call

class PostRemoteDataSourceRepositoryImplementation(private val apiService: ApiService) :
    PostRemoteDataSourceRepository {
    override suspend fun getPostFromServer(): List<PostModel> {
        return apiService.getPost()
    }
}