package com.nanda.dagger2example.ui.home

import android.os.Bundle
import android.os.Handler
import com.nanda.dagger2example.R
import com.nanda.dagger2example.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

class HomeActivity : BaseActivity(), HomeView {

    @Inject
    lateinit var presenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Example of a call to a native method
        sample_text.text = "Hell0"

        presenter!!.setView(this)

        Handler().postDelayed({
            presenter!!.getData()
        }, 1000)
    }

    override fun onResponse(input: String) {
        sample_text.text = input
    }

}
