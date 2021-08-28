package com.example.olympic_tokyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFile()
    }

    private fun openFile(){
        val inputStream= assets.open("tokyo.csv")
        val buffer= BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            Log.v("MAIN_ACTIVITY",it)
        }
    }
}