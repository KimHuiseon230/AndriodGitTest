package com.example.andriodgithubtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.andriodgithubtest.databinding.ActivitySub23Binding
import com.example.andriodgithubtest.databinding.TestLayout1Binding
import com.example.andriodgithubtest.databinding.TestLayout3Binding
import com.example.andriodgithubtest.databinding.TestLayout4Binding
import com.example.andriodgithubtest.databinding.TestLayout5Binding
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var binding: TestLayout1Binding
    lateinit var binding2: TestLayout3Binding
    lateinit var binding3: TestLayout4Binding
    lateinit var binding5: TestLayout5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding5 = TestLayout5Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding5.root)
        binding5.btnNavi.setOnClickListener {
            binding5.layoutDrawer.openDrawer(GravityCompat.START) //START =left END = right
        }
        binding5.naviView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { //네비게이션 메뉴  아니템 클릭시 수행
        when (item.itemId) //선언했던 id 값을 가져옴
        {
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
        }
        binding5.layoutDrawer.closeDrawers() //네이게이션 닫기
        return false
    }
}

/*val item = arrayListOf("사과", "배", "포도", "오렌지")
binding3.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,item)*/
/*binding2.btnToast.setOnClickListener {
    Toast.makeText(this, "버튼이 클릭되었습니다!", Toast.LENGTH_SHORT).show()
}*/

/*binding.btnA.setOnClickListener {
    //이 시점에서는 아직 subActivity 생성이 되지 않은 시점
    val intent = Intent(this, subActivity::class.java)
    intent.putExtra(
        "mag", binding.tvSendMessage1.toString()// '환영합니다' 라는  택스트 값을 담은 뒤 mag라는 키로 잠궜다.
    )
    startActivity(intent)   // intent에 저자오디어있는 액티비티 쪽으로 이동한다.
    finish()                // 자기 자신의 액티를 종료
}*/

/*binding.btnGetText.setOnClickListener {   // 에딧택스트에 입력 되어있는 값을 가지고 와서 텍트 뷰에 뿌려주는 역할을 한다.
    var resultText = binding.edtViewthing.text.toString() // 입력되어 있는 텍스트 값을 스트링(문자열)형태로 가져와 달라.
    binding.tvRe.setText(resultText) // 입력된 값을 텍스트뷰에 set 해줌
}*/