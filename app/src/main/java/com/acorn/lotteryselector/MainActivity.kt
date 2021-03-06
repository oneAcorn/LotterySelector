package com.acorn.lotteryselector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acorn.lotteryselector.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}