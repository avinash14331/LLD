package com.avi.tictactoe.factories;

import com.avi.tictactoe.models.Bot;
import com.avi.tictactoe.models.HumanPlayer;
import com.avi.tictactoe.models.Player;

public class PlayerFactory {
    public static HumanPlayer.HumanPlayerBuilder getHumanPlayerBuilder(){
        return HumanPlayer.builder();
    }
    public static Bot.BotBuilder getBotPlayer(){
        return Bot.builder();
    }
}
