package com.example.a13_mavzuexpandablelistviewspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a13_mavzuexpandablelistviewspinner.adapters.MyExpandAdapter
import com.example.a13_mavzuexpandablelistviewspinner.databinding.ActivityMainBinding
import com.example.a13_mavzuexpandablelistviewspinner.utils.MyData

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var myExpandAdapter: MyExpandAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.loadData()
        myExpandAdapter = MyExpandAdapter(MyData.titlelist, MyData.map)
        binding.expandView.setAdapter(myExpandAdapter)
    }
}