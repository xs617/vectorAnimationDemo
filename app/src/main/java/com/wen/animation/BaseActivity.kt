package com.wen.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.umeng.analytics.MobclickAgent

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    override fun onResume() {
        super.onResume()
        MobclickAgent.onResume(this)
        MobclickAgent.onPageStart(this.localClassName)
    }

    override fun onPause() {
        super.onPause()
        MobclickAgent.onPageEnd(this.localClassName)
        MobclickAgent.onPause(this)

    }
}
