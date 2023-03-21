package com.example.andriodgithubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Toast
import com.example.andriodgithubtest.databinding.ActivityMain3Binding

/*class MainActivity3 : AppCompatActivity(), View.OnClickListener {*/
class MainActivity3 : AppCompatActivity(){
    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

/*binding.btnClick1.setOnClickListener(this)
binding.btnClick2.setOnClickListener(this)

binding.btnClick3.setOnClickListener(object : View.OnClickListener {
    override fun onClick(v: View?) {
        Toast.makeText(applicationContext, "c3", Toast.LENGTH_SHORT).show()
    }
})

binding.btnClick4.setOnClickListener { v: View? ->
    Toast.makeText(applicationContext, "c4", Toast.LENGTH_SHORT).show()
}
}

override fun onClick(v: View?) {
    when (v?.id) {
        R.id.btnClick1 -> {
            Toast.makeText(applicationContext, "c1", Toast.LENGTH_SHORT).show()
        }
        R.id.btnClick1 -> {
            Toast.makeText(applicationContext, "c2", Toast.LENGTH_SHORT).show()
        }
    }
}*/

