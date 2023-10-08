package com.example.android_koin_practice_app.utils.networking


import com.example.android_koin_practice_app.core.usecase.Either
import com.example.android_koin_practice_app.core.usecase.Either.Left
import com.example.android_koin_practice_app.core.usecase.Either.Right
import com.example.android_koin_practice_app.core.usecase.Failure
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


fun provideMoshi(): Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()


fun provideApiService(moshi: Moshi): ApiService = Retrofit.Builder().run {
    baseUrl(ApiService.BASE_URL)
    addConverterFactory(MoshiConverterFactory.create(moshi))
    build()
}.create(ApiService::class.java)


