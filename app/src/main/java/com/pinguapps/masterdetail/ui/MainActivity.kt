package com.pinguapps.masterdetail.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pinguapps.masterdetail.R
import com.pinguapps.masterdetail.util.isTablet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isTablet(this)){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.master_container, MasterFragment())
                .commit()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.detail_container, DetailFragment())
                .commit()
        } else {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, MasterFragment())
                .commit()
        }
    }

}