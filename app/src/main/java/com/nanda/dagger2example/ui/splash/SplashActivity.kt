package com.nanda.dagger2example.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.nanda.dagger2example.R
import com.nanda.dagger2example.base.BaseActivity
import com.nanda.dagger2example.base.BaseNormalActivity
import com.nanda.dagger2example.ui.home.HomeActivity

class SplashActivity : BaseNormalActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
        }, 1000)
    }

}