package com.example.lancemoreland.videogamelibrary;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface VideoGameDao {

    //Allow us to get all videogames

    @Query("SELECT * FROM videogame")
    List<VideoGame> getVideoGames();

    //allows us to add a single game to the list



    //allows us to update the values of an existing game

    //allows us to delete a game from library


}
