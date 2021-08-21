package com.example.netologydiploma.db

import androidx.room.TypeConverter
import java.time.Instant

class InstantDateConverter {

    @TypeConverter
    fun fromInstantToMillis(instant: Instant): Long =
        instant.toEpochMilli()

    @TypeConverter
    fun fromMillisToInstant(milis: Long) : Instant =
        Instant.ofEpochMilli(milis)
}