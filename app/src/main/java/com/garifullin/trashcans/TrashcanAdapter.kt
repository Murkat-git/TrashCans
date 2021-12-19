package com.garifullin.trashcans

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import androidx.core.content.ContextCompat.startActivity





class TrashcanAdapter(options: FirestoreRecyclerOptions<Trashcan>) :
    FirestoreRecyclerAdapter<Trashcan, TrashcanViewHolder>(options) {
    override fun onBindViewHolder(holder: TrashcanViewHolder, position: Int, model: Trashcan) {
        holder.bind(model)
        holder.itemView.setOnClickListener {
//            val intent: Intent = Intent(holder.itemView.context, MapsActivity::class.java)
//            intent.putExtra("latitude", model.location.latitude)
//            intent.putExtra("longtitude", model.location.longitude)
//            holder.itemView.context.startActivity(intent)
            val strUri =
                "http://maps.google.com/maps?q=loc:" + model.location.latitude.toString() + "," + model.location.longitude.toString() + " (" + "Мусорка" + ")"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(strUri))

            intent.setClassName(
                "com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity"
            )

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrashcanViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.trashcan_item, parent, false)
        return TrashcanViewHolder(v)
    }
}