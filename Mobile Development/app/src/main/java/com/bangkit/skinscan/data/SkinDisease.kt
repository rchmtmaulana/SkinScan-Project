package com.bangkit.skinscan.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SkinDisease (
    val name: String,
    val description: String,
    val image: Int
) : Parcelable