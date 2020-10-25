package kr.co.tjoeun.loginlogictest_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {


//             입력된 이메일과 / 비밀번호를 별도의 변수에 저장
            val inputEmail = emailEdt.text.toString()
            val inputpw = passwordEdt.text.toString()

//            질문 : 입력한 이메일 -"admin@test.com" AND 입력한 비번 - "qwer"
            if (inputEmail == "admin@test.com" && inputpw == "qwer") {

//                질문 결과가 true (맞다고 판명) 이면 관리자 로그인 토스트
                Toast.makeText(this, "관리자가 로그인 했습니다.", Toast.LENGTH_SHORT).show()
            }
            else {
//                질문 결과가 false (하나라도 틀린 상황) 이면 로그인 실패 토스트
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }

    }
}