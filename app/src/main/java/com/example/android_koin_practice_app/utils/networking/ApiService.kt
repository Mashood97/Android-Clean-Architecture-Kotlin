package com.example.android_koin_practice_app.utils.networking

import com.example.android_koin_practice_app.modules.post.data.model.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("posts")
    suspend fun getPost(): List<PostModel>

}