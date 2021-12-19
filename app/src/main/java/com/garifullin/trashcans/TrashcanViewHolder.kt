package com.garifullin.trashcans

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.skydoves.progressview.ProgressView
import com.squareup.picasso.Picasso

class TrashcanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun bind(trashcan: Trashcan){
        val weight: ProgressView = itemView.findViewById(R.id.progressWeight)
        val distance: ProgressView = itemView.findViewById(R.id.progressDistance)
        val img: ImageView = itemView.findViewById(R.id.trashcanImg)
        Picasso.get().load(trashcan.imgUrl).into(img)
        weight.max = trashcan.maxWeight
        weight.progress = trashcan.weight
        distance.max = trashcan.maxDistance
        distance.progress = trashcan.distance
    }
}