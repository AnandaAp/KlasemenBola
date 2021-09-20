package com.anlian.klasemenbola

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anlian.klasemenbola.databinding.ActivityItemDetailBinding

class ItemDetail : AppCompatActivity() {
    private lateinit var binding: ActivityItemDetailBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val clubName: String? = intent.getStringExtra("clubName")
        val position: Int = intent.getIntExtra("position",0)
        val score: Int = intent.getIntExtra("score",0)


        binding.detailTitle.text = clubName
        binding.positionValue.text = position.toString()
        binding.detailScoreValue.text = "$score scores"
    }
}