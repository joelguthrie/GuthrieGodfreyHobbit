/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit2;

import cit260.hobbit.model.Game;
import cit260.hobbit.model.Player;
import cit260.hobbit.view.StartProgramView;


/**
 *
 * @author Bryant
 */
public class Hobbit2 {
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hobbit2.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hobbit2.player = player;
    }
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        
        
    }
    
}
