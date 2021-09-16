package com.anlian.klasemenbola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anlian.klasemenbola.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ClassementAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        loadData()
    }

    private fun loadData() {
        val list = arrayListOf<ClassementDataClass>()
        inputDataClassement(list)
        list.forEach{
            println(it.name)
        }
        println("Masuk Adapter")
        val adapter = ClassementAdapter(list)
        binding.rcView.layoutManager = LinearLayoutManager(this)
        binding.rcView.adapter = adapter
    }

    private fun inputDataClassement(list: ArrayList<ClassementDataClass>) {
        list.add(ClassementDataClass(1,"Manchester United",10))
        list.add(ClassementDataClass(2, "Chelsea", 10))
        list.add(ClassementDataClass(3,"Liverpool",10))
        list.add(ClassementDataClass(4,"Everton",10))
        list.add(ClassementDataClass(5,"Mancherster City",9))
        list.add(ClassementDataClass(6,"Brighton & Hove Albion",9))
        list.add(ClassementDataClass(7,"Tottenham Hotspur",9))
        list.add(ClassementDataClass(8,"West Ham United",8))
        list.add(ClassementDataClass(9,"Leicester City",6))
        list.add(ClassementDataClass(10,"Brentford FC",5))
        list.add(ClassementDataClass(11,"Crystal Palace",5))
        list.add(ClassementDataClass(12,"Aston Villa",4))
        list.add(ClassementDataClass(13,"Wolverhampton Wanderers",3))
        list.add(ClassementDataClass(14,"Southampton FC",3))
        list.add(ClassementDataClass(15,"Watford FC",3))
        list.add(ClassementDataClass(16,"Arsenal", 3))
        list.add(ClassementDataClass(17,"Leeds United AFC",2))
        list.add(ClassementDataClass(18,"Burnley FC",1))
        list.add(ClassementDataClass(19,"Newcastle United",1))
        list.add(ClassementDataClass(20,"Norwich City",0))
    }
}