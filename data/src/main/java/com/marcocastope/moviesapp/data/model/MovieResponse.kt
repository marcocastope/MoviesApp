package com.marcocastope.moviesapp.data.model

import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.squareup.moshi.Json

class MovieResponse(
    @field:Json(name = "results")
    val results: List<MovieEntity> = emptyList()
)