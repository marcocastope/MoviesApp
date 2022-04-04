package com.marcocastope.moviesapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/marcocastope/moviesapp/domain/repository/Repository;", "", "getAllMovies", "", "Lcom/marcocastope/moviesapp/domain/entities/MovieEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieById", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieById(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marcocastope.moviesapp.domain.entities.MovieEntity> continuation);
}