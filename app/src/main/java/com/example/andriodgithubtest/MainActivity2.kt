package com.example.andriodgithubtest

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andriodgithubtest.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //  기본 방법을 사용한 방법1
        binding.ckbCilck1.setOnCheckedChangeListener(this)
        binding.ckbCilck2.setOnCheckedChangeListener(this)
        // 임시객체를 이용한 방법2
        binding.ckbCilck3.setOnCheckedChangeListener(object :
            CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(applicationContext, "ck3", Toast.LENGTH_SHORT).show()
            }
        })
        // 람다식을 이용한 방법3
        binding.ckbCilck4.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(
                applicationContext, "ck4", Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when (buttonView?.id) {
            R.id.ckbCilck1 -> Toast.makeText(applicationContext, "ck1", Toast.LENGTH_SHORT).show()
            R.id.ckbCilck2 -> Toast.makeText(applicationContext, "ck2", Toast.LENGTH_SHORT).show()
        }
    }

}