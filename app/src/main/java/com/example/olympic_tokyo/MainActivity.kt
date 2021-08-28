package com.example.olympic_tokyo

import android.view.LayoutInflater
import com.example.olympic_tokyo.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater:(LayoutInflater) -> ActivityMainBinding= ActivityMainBinding::inflate


    private fun openFile(){
        val inputStream= assets.open("tokyo.csv")//access file
        val buffer= BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            log(it)
        }
    }

    override fun setup() {
        openFile()
    }

    override fun addCallback() {
        //binding.action
    }
}