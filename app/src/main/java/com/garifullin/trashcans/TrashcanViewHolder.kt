package com.garifullin.trashcans

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.progressview.ProgressView

class TrashcanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bind(trashcan: Trashcan){
        var weight: ProgressView = itemView.findViewById(R.id.progressWeight)
        var distance: ProgressView = itemView.findViewById(R.id.progressDistance)
        weight.max = trashcan.maxVeight
        weight.progress = trashcan.weight
        distance.max = trashcan.maxDistance
        distance.progress = trashcan.distance
    }
}