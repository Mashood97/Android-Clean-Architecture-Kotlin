package com.example.android_koin_practice_app.modules.post.data.model

import com.example.android_koin_practice_app.modules.post.domain.entity.PostEntity
import com.squareup.moshi.Json

data class PostModel(
  @Json(name = "id")  val id: Int,
  @Json(name = "body")  val body: String
) : PostEntity(postId = id, postBody = body)