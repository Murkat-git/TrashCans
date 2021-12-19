package com.garifullin.trashcans

import com.google.firebase.firestore.GeoPoint

class Trashcan{
    val distance:Float = 0f
    val maxDistance:Float = 0f
    val weight:Float = 0f
    val maxWeight:Float = 0f
    val location:GeoPoint = GeoPoint(0.0, 0.0)
    val imgUrl: String = ""
}
