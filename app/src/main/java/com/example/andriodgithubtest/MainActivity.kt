package com.example.andriodgithubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import com.example.andriodgithubtest.databinding.ActivityMain4Binding
import com.example.andriodgithubtest.databinding.ActivityMainBinding
import com.example.andriodgithubtest.databinding.ActivitySub23Binding

// 타이머를 만들어 시작, 멈춤, 리셋을 설정하여 동작구현
class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    var pauseTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener(this)
        binding.btnStop.setOnClickListener(this)
        binding.btnReset.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_start -> {
                binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
                binding.chronometer.start()
                binding.btnStart.isEnabled = false
                binding.btnStop.isEnabled = true
                binding.btnReset.isEnabled = true
            }
            R.id.btn_stop -> {
                pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = true
            }
            R.id.btn_reset -> {
                binding.chronometer.base = SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                pauseTime = 0L
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = false
            }
        }
    }
}