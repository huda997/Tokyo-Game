package com.example.olympic_tokyo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.olympic_tokyo.databinding.ItemTokyoBinding

class GamesAdapter(val list:List<Games>):RecyclerView.Adapter<GamesAdapter.GamesViewHolder>() {

    class GamesViewHolder(ViewItem:View):RecyclerView.ViewHolder(ViewItem)
    { val binding=ItemTokyoBinding.bind(ViewItem)}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.item_tokyo, parent, false)
        return GamesViewHolder(View)
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        val currentGame = list[position]
        holder.binding.apply {
            textTeams.text = currentGame.teams
            goldMedal.text = currentGame.goldMedal.toString()
            silverMedal.text = currentGame.silverMedal.toString()
            bronzeMedal.text = currentGame.bronzeMedal.toString()
        }
    }

    override fun getItemCount()=list.size
    }
