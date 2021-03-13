package com.amccmember.appsnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.databinding.DataBindingUtil
import com.amccmember.appsnews.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    private lateinit var binding : ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_login)

        binding.etInputUsername
        binding.etInputPassword

        binding.btnLogin.setOnClickListener {

        }




    }
}