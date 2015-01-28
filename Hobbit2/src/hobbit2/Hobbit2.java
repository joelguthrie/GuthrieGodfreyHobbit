/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit2;

import cit260.hobbit.model.Player;

/**
 *
 * @author Bryant
 */
public class Hobbit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bilbo Baggins");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
    }
    
}
