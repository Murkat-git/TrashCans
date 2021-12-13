package com.garifullin.trashcans

import com.google.firebase.firestore.GeoPoint

data class Trashcan(val distance:Float, val maxDistance:Float, val weight:Float, val maxVeight:Float, val location:GeoPoint)
