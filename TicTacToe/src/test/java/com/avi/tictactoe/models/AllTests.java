package com.avi.tictactoe.models;

import com.avi.tictactoe.factories.PlayerFactory;
import org.junit.Before;

public class AllTests {
    private Game game;
    @Before
    public void setUp(){
        this.game = createGame();
    }

    private Game createGame(){
        return new Game.GameBuilder()
                .withDimentions(3,3)
                .withPlayer(PlayerFactory.getHumanPlayerBuilder()
                        .user(new User())
                        .symbol(GameSymbol.O)
                        .build())
                .withPlayer(PlayerFactory.getBotPlayer().build()
                        .builder()
                        .symbol(GameSymbol.X)
                        .build())
                .build();
    }
}
