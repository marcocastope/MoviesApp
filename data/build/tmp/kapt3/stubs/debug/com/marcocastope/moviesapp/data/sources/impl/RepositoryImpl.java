package com.marcocastope.moviesapp.data.sources.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/marcocastope/moviesapp/data/sources/impl/RepositoryImpl;", "Lcom/marcocastope/moviesapp/domain/repository/Repository;", "remoteDataSource", "Lcom/marcocastope/moviesapp/data/sources/RemoteDataSource;", "localDataSource", "Lcom/marcocastope/moviesapp/data/sources/LocalDataSource;", "(Lcom/marcocastope/moviesapp/data/sources/RemoteDataSource;Lcom/marcocastope/moviesapp/data/sources/LocalDataSource;)V", "getAllMovies", "", "Lcom/marcocastope/moviesapp/domain/entities/MovieEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieById", "movieId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class RepositoryImpl implements com.marcocastope.moviesapp.domain.repository.Repository {
    private final com.marcocastope.moviesapp.data.sources.RemoteDataSource remoteDataSource = null;
    private final com.marcocastope.moviesapp.data.sources.LocalDataSource localDataSource = null;
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.marcocastope.moviesapp.data.sources.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.marcocastope.moviesapp.data.sources.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieById(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.marcocastope.moviesapp.domain.entities.MovieEntity> continuation) {
        return null;
    }
}