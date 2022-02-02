package com.avi.tictactoe.models;

import com.avi.tictactoe.strategies.playing.PlayingStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
public class Bot extends Player{
    private PlayingStrategy playingStrategy;
//    public Bot(PlayingStrategy playingStrategy){
//        this.playingStrategy = playingStrategy;
//    }
    @Override
    public BoardCell move(Board board) {
        return null;
    }
}
