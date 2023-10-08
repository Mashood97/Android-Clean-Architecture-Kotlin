package com.example.android_koin_practice_app.utils.di

import android.app.Application
import org.koin.core.context.startKoin


/*In this class we will add all di modules inside start koin to make them available for managing di.*/
class DIBaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(retrofitDiModule, repositoriesDI, useCaseDI,viewModelModule)
        }
    }
}