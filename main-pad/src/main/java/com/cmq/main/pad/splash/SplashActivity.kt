package com.cmq.main.pad.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.cmq.base.view.BaseActivity
import com.cmq.main.pad.login.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch{
            delay(200)
            startActivity(Intent(this@SplashActivity,LoginActivity::class.java))
        }
    }
}