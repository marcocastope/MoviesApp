package com.marcocastope.moviesapp.data.sources.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/marcocastope/moviesapp/data/sources/impl/LocalDataSourceImpl;", "Lcom/marcocastope/moviesapp/data/sources/LocalDataSource;", "movieDao", "Lcom/marcocastope/moviesapp/data/database/MovieDao;", "(Lcom/marcocastope/moviesapp/data/database/MovieDao;)V", "fetchAllMovies", "", "Lcom/marcocastope/moviesapp/domain/entities/MovieEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMovieById", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class LocalDataSourceImpl implements com.marcocastope.moviesapp.data.sources.LocalDataSource {
    private final com.marcocastope.moviesapp.data.database.MovieDao movieDao = null;
    
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.marcocastope.moviesapp.data.database.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchAllMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object fetchMovieById(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marcocastope.moviesapp.domain.entities.MovieEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveAllMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}