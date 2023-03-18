package com.example.andriodgithubtest

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.andriodgithubtest.databinding.TestLayout1Binding
import com.example.andriodgithubtest.databinding.TestLayout2Binding

class subActivity : AppCompatActivity() {
    lateinit var binding: TestLayout2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestLayout2Binding.inflate(layoutInflater)
        setContentView(R.layout.test_layout2)
        if (intent.hasExtra("mag")) {
            binding.tvSendMessage2.text = intent.getStringExtra("mag")
            //서브 액티비티에 존재하는 텍스트뷰에 다가  환영합니다라는 문구가 나옴.
        }

    }
}