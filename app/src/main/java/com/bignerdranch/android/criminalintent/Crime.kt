package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID
@Entity
data class Crime (
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false)
{
    // after banging my head on an error message for like 2 hours this was a roundabout solution that
    // i found. for some reason the app isnt recognizing the above contructor that i am giving at as
    // the default, so i have to give it some other one as a reference.
    @Ignore
    constructor() : this(UUID.randomUUID(), "", Date(), false)
}