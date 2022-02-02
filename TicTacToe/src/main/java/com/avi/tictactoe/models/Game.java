package com.avi.tictactoe.models;

import com.avi.tictactoe.strategies.winning.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private WinningStrategy winningStrategy;
    private Game(){
        this.players = new ArrayList<>();
    }
    public static class GameBuilder{
        private Game game ;
        public GameBuilder(){
            this.game = new Game();
        }
        public GameBuilder withDimentions(int rows, int columns){
            Board board = new Board(rows,columns);
            this.game.board =board;
            return this;
        }
        public GameBuilder withPlayer(Player player){
            this.game.players.add(player);
            return this;
        }
        public Game build(){
            return this.game;
        }
    }
}
