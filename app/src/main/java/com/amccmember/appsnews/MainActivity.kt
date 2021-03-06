package com.amccmember.appsnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: berhasil dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: berhasil dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: berhasil dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: berhasil dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: berhasil dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: berhasil dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: berhasil dijalankan")
    }
}