/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.control;

import cit260.hobbit.model.Player;
import hobbit2.Hobbit2;

/**
 *
 * @author Bryant
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
     if (playersName == null){
         return null;
     }
     
     Player player = new Player();
     player.setName(playersName);
     Hobbit2.setPlayer(player);
     
     return player;
          
     }
    }
    

