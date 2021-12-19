package com.garifullin.trashcans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var adapter: FirestoreRecyclerAdapter<Trashcan, TrashcanViewHolder>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rc: RecyclerView = findViewById(R.id.recycler)
        rc.layoutManager = GridLayoutManager(this, 2)
        val db = Firebase.firestore
        val query: Query = db.collection("trashcans")

        val options: FirestoreRecyclerOptions<Trashcan> = FirestoreRecyclerOptions.Builder<Trashcan>()
                .setQuery(query, Trashcan::class.java)
            .build()

        adapter = TrashcanAdapter(options)
        rc.adapter = adapter
        adapter.startListening()
    }

}