package com.example.lancemoreland.videogamelibrary;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;

@Database(version = 1, entities = VideoGame.class)
@TypeConverter(DateConverter.class)
public abstract class VideoGameDatabase extends RoomDatabase {


    public abstract VideoGameDao videoGameDao();
}
