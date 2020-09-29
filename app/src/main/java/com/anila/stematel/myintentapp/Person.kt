package com.anila.stematel.myintentapp

import android.os.Parcel
import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable