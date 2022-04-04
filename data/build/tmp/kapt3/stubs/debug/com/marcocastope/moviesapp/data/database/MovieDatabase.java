package com.marcocastope.moviesapp.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.marcocastope.moviesapp.domain.entities.MovieEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/marcocastope/moviesapp/data/database/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/marcocastope/moviesapp/data/database/MovieDao;", "data_debug"})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    
    public MovieDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.marcocastope.moviesapp.data.database.MovieDao movieDao();
}