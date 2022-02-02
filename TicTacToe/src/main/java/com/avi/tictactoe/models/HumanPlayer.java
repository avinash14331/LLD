package com.avi.tictactoe.models;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
public class HumanPlayer extends Player{
    private User user;
    @Override
    public BoardCell move(Board board) {
        return null;
    }
}
