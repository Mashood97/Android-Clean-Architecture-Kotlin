package com.example.android_koin_practice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.android_koin_practice_app.utils.di.DIComponent
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val component = DIComponent()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                component.mainViewModel.getPosts()
            }
        }
    }
}