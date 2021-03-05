package com.fernando.service;

import com.fernando.model.Game;
import com.fernando.model.GameInfo;

import java.util.List;

public interface GameManager {
    void addGame(GameInfo gameInfo);
    void removeGame(GameInfo gameInfo);
    List<Game> getGames();
    void sortGames();
}
