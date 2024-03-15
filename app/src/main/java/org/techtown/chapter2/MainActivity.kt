package org.techtown.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.techtown.chapter2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            var num:String=binding.textView.text.toString()
            binding.textView.setText("0")
            Toast.makeText(this,"초기화 했습니다. 초기화 이전까지의 값은 ${num}",Toast.LENGTH_LONG).show()
        }
        binding.button2.setOnClickListener{
            var numInt:Int=binding.textView.text.toString().toInt()
            numInt+=1
            binding.textView.setText(numInt.toString())
        }

    }
}
/*
배운점
1, layout_weight를 설정해주는 경우, layout_width 또는 layout_height가 0dp를 가져야 한다.
무엇을 0으로 하는가? -> 부모 layout이 무엇이냐에 따라 결정된다
부모 layout이 horizontal이다 -> layout_width를 0dp로 / 부모 layout이 vertical이다 -> layout_height를 0dp로

 */