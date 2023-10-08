package com.example.android_koin_practice_app.modules.post.data.data_sources.remote

import com.example.android_koin_practice_app.modules.post.data.model.PostModel
import retrofit2.Call

interface PostRemoteDataSourceRepository {
    suspend fun getPostFromServer(): List<PostModel>
}