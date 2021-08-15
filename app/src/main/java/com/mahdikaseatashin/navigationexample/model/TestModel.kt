package com.mahdikaseatashin.navigationexample.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TestModel(
    val id: Int,
    val username: String
) : Parcelable
