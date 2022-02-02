package com.avi.tictactoe.strategies.playing;

import com.avi.tictactoe.models.Board;
import com.avi.tictactoe.models.BoardCell;

public interface PlayingStrategy {
    public BoardCell play(Board board);
}
