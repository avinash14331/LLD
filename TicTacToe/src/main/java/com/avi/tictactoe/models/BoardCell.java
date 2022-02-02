package com.avi.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCell {
    private Integer x;
    private Integer y;
    GameSymbol symbol;
}
