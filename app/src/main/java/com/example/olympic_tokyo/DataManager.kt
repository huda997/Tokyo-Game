package com.example.olympic_tokyo

import com.example.olympic_tokyo.Games

object DataManager{
    val gamesList= mutableListOf<Games>()
    private val gameIndex=8
    val games:List<Games>
    get() = gamesList
    fun addGames(game: Games)
    {
        gamesList.add(game)
    }
    fun getCurrentGames():Games= gamesList[gameIndex]
}