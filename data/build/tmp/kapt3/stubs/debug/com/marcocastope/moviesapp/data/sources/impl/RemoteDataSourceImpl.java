package com.marcocastope.moviesapp.data.sources.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/marcocastope/moviesapp/data/sources/impl/RemoteDataSourceImpl;", "Lcom/marcocastope/moviesapp/data/sources/RemoteDataSource;", "movieService", "Lcom/marcocastope/moviesapp/data/api/MovieService;", "(Lcom/marcocastope/moviesapp/data/api/MovieService;)V", "apiKey", "", "retrieveAllMovies", "", "Lcom/marcocastope/moviesapp/domain/entities/MovieEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class RemoteDataSourceImpl implements com.marcocastope.moviesapp.data.sources.RemoteDataSource {
    private final com.marcocastope.moviesapp.data.api.MovieService movieService = null;
    private final java.lang.String apiKey = "6d725a6b548a8a278321f65fd6abcc3d";
    
    public RemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.marcocastope.moviesapp.data.api.MovieService movieService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object retrieveAllMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.marcocastope.moviesapp.domain.entities.MovieEntity>> continuation) {
        return null;
    }
}