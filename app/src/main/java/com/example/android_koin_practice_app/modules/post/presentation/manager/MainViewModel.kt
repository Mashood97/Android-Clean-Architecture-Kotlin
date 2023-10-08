package com.example.android_koin_practice_app.modules.post.presentation.manager

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_koin_practice_app.core.usecase.Either
import com.example.android_koin_practice_app.modules.post.domain.use_case.GetPostUseCase
import kotlinx.coroutines.launch


class MainViewModel constructor(private val postUseCase: GetPostUseCase) : ViewModel() {

    fun getPosts() {
        viewModelScope.launch {
            var response = postUseCase.run(params = Unit)
            when (response) {
                is Either.Left -> Log.d(
                    "====>>>GET POST FAILUREEEEEE====>>>",
                    "getPosts:${response.left}"
                )

                is Either.Right -> Log.d(
                    "====>>>GET POST SUCCESSS====>>>",
                    "getPosts:${response.right}"
                )
            }
        }

    }
}