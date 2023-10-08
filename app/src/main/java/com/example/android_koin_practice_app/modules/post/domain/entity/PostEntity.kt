package com.example.android_koin_practice_app.modules.post.domain.entity

open class PostEntity(
    val postId: Int,
    val postBody: String
) {


    override fun equals(other: Any?): Boolean {
        return when (other) {
            is PostEntity -> {
                this.postId == other.postId &&
                        this.postBody == other.postBody
            }

            else -> false
        }
    }
}