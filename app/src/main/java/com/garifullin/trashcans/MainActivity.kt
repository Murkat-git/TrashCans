package com.garifullin.trashcans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Recyclerview: RecyclerView = findViewById(R.id.recycler)
        Recyclerview.layoutManager = GridLayoutManager(this, 2)

        var query: Query = FirebaseFirestore.getInstance().collection("trashcans")

        var options: FirestoreRecyclerOptions<Trashcan> = FirestoreRecyclerOptions.Builder<Trashcan>()
                .setQuery(query, Trashcan::class.java)
            .setLifecycleOwner(this)
            .build()


    }
}