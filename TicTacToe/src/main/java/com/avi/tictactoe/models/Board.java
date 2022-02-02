package com.avi.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Board{
   List<List<BoardCell>> cells = new ArrayList<>();
    public Board(int row,int column){
        List<BoardCell> columns = Collections.nCopies(column,new BoardCell());
        List<List<BoardCell>> rows = Collections.nCopies(row,columns);
        this.cells=rows;
    }
}
