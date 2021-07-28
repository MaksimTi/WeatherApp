package com.example.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.repository.getRepository


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerWeather = findViewById(R.id.recyclerWeather)
        val adapter = WeatherAdapter.getInstance(getRepository())
        recyclerWeather.adapter = adapter

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Нажата кнопка",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}