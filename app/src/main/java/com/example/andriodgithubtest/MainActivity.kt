package com.example.andriodgithubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import com.example.andriodgithubtest.databinding.ActivitySub18Binding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitySub18Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub18Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

/* 다른 방법으로 출력하기
binding2.tvClick.setOnLongClickListener(){
    Toast.makeText(applicationContext,binding2.edPassword.text.toString(),Toast.LENGTH_SHORT).show()
    return@setOnLongClickListener(true) <-- 반드시 꼭 사용해함 -->
}
*/

/* 기본 방법으로 출력하기
binding2.tvClick.setOnClickListener() {
    binding2.edPassword.inputType = InputType.TYPE_TEXT_VARIATION_NORMAL
    Toast.makeText( applicationContext,binding2.edPassword.text.toString(),Toast.LENGTH_SHORT).show()
}*/

/*@ viewbinding 사용하는 방법
        1. gradle script >  viewBinding{ enabled = true } 추가
        2. lateinit var binding: 사용하여 불러올 Activity xml 파일 불러오기
        3. binding=ActivitySub4Binding.inflate(layoutInflater) 추가
        4. setContentView(binding.root) 수정  //activity에 만든 xml 화면을 딱 매치 시켜서 보여준다.
*/

/*@ 로딩 화면 함수
    with(binding) {
            thread(start = true) { ->
                Thread.sleep(3000)
                runOnUiThread {
                    progressBar.visibility = View.GONE
                }
            }
        }//end with
        binding.RadioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                //logcat에서 확인 가능
                R.id.radioButton  -> { Log.d("첫번째 선택","사과가 선택되었습니다.")}
                R.id.radioButton2 -> { Log.d("두번째 선택","배가 선택되었습니다.")}
                R.id.radioButton3 -> { Log.d("세번째 선택","바나나가 선택되었습니다.")}
            }
        }*/

/* @버튼 클릭 함수
    binding.btnClick.setOnClickListener {
           if (flag == true) {
               binding.btnTarget.visibility = View.VISIBLE
               binding.btnClick.visibility = View.VISIBLE
               flag = true
           } else {
               binding.btnTarget.visibility = View.VISIBLE
               binding.btnClick.visibility = View.VISIBLE
               flag = false
           }
       }*/