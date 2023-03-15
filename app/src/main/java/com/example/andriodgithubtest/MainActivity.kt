package com.example.andriodgithubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.andriodgithubtest.databinding.ActivitySub3Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySub3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySub3Binding.inflate(layoutInflater)
        setContentView(binding.root) //activity에 만든 xml 화면을 딱 매치시켜서 보여준다.
        //우리는 뷰바인딩을 사용해서 가져옴(알아서 일므을 바뀜)
        //setters getters 을 사용해서 5가지의 기능을 처리할 수 있음.
        binding.btnName2.text="홍수련"
    }
}