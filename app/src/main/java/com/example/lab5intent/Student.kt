package com.example.lab5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(val name:String, val gender: String,val email: String, var salary: Int) : Parcelable {
}