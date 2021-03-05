package com.fernando.service;
import com.fernando.model.Game;
import com.fernando.model.GameInfo;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class GameService implements  GameManager{
    private List<Game> games;

    @PostConstruct
    public void defaultGames(){
        games = new ArrayList<>();
        games.add(new GameInfo("Call of Duty 4", 39.99, 34,"Activision"));
        games.add(new GameInfo("Uncharted 4", 29.99, 67,"Naughty Dog"));
    }

    @Override
    public List<Game> getGames() {
        return games;
    }

    @Override
    public void addGame(GameInfo gameInfo) {
        if(!gameInfo.getName().isEmpty()) {
            games.add(gameInfo);
        }
    }

    @Override
    public void removeGame(GameInfo gameInfo) {
        for(int i = 0; i < games.size(); i++){
            if(games.get(i).getName().equals(gameInfo.getName())){
                games.remove(i);
            }
        }
    }
    @Override
    public void sortGames() {
        Collections.sort(games);
    }

}
