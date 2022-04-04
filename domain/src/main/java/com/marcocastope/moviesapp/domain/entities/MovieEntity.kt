package com.marcocastope.moviesapp.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "movies")
data class MovieEntity(
    @field:Json(name = "title")
    val title: String,
    @field:Json(name = "vote_average")
    val voteAverage: Float,
    @field:Json(name = "release_date")
    val releaseDate: String,
    @field:Json(name = "poster_path")
    val posterPath: String,
    @field:Json(name = "overview")
    val overview: String,
    @PrimaryKey(autoGenerate = true)
    @field:Json(name = "id")
    val id: Long
)
