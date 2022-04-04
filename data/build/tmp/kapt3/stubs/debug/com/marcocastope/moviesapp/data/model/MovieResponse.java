package com.marcocastope.moviesapp.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/marcocastope/moviesapp/data/model/MovieResponse;", "", "results", "", "Lcom/marcocastope/moviesapp/domain/entities/MovieEntity;", "(Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "data_debug"})
public final class MovieResponse {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    private final java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity> results = null;
    
    public MovieResponse() {
        super();
    }
    
    public MovieResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity> results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity> getResults() {
        return null;
    }
}