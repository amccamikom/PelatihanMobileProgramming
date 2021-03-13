package com.amccmember.appsnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.amccmember.appsnews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = "Mainactivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        Log.d(TAG, "OnCreate : Berhasil dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: berhasil dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: berhasil dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: berhasil dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: berhasil dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: berhasil dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: berhasil dijalankan")
    }
}