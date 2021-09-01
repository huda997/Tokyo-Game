package com.example.olympic_tokyo

import android.view.LayoutInflater
import com.example.olympic_tokyo.databinding.ActivityMainBinding
import util.Csvpraser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater:(LayoutInflater) -> ActivityMainBinding= ActivityMainBinding::inflate


    private fun parseFile(){
        val inputStream= assets.open("tokyo")//access file
        val buffer= BufferedReader(InputStreamReader(inputStream))
        val parser=Csvpraser()
        buffer.forEachLine {
           val currentgame= parser.parse(it)
            DataManager.addGames(currentgame)
        }
    }

    override fun setup() {
        parseFile()
        val adapter=GamesAdapter(DataManager.games)
        binding!!.gameRecycler.adapter=adapter
    }

    override fun addCallback() {
        //binding.action
    }
}