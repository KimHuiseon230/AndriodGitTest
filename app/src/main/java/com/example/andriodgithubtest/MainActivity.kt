package com.example.andriodgithubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.andriodgithubtest.databinding.ActivitySub23Binding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySub23Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub23Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

/*binding.btnSelect1.setOnClickListener {
    binding.screen1.visibility = View.VISIBLE
    binding.screen2.visibility = View.INVISIBLE
}
binding.btnSelect2.setOnClickListener {
    binding.screen1.visibility = View.INVISIBLE
    binding.screen2.visibility = View.VISIBLE
}
//FameLayout->Linerlayout 1번 화면
binding.imgPic1.setOnClickListener {
    Toast.makeText(this, "1번 화면입니다!", Toast.LENGTH_SHORT).show()
}
//FameLayout->Linerlayout 2번 화면
binding.imgPic2.setOnClickListener {
    Toast.makeText(this, "2번 화면입니다!", Toast.LENGTH_SHORT).show()
}*/

/* 암호를 보여줬다 감추는 이벤트 처리
binding.chbVisible.isChecked = false
binding.chbVisible.text = "invisible"

binding.chbVisible.setOnClickListener {
    //암호를 보여줄 것
    if (binding.chbVisible.isChecked == true) {
        binding.edtPassword2.inputType = InputType.TYPE_CLASS_TEXT
        binding.chbVisible.text = "visible"
    }
    //암호를 보여주지 말것
    else {
        binding.edtPassword2.inputType =
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        binding.chbVisible.text = "invisible"
    }
}*/
