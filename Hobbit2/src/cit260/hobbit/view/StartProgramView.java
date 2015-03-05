/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import cit260.hobbit.control.ProgramControl;
import cit260.hobbit.model.Player;
import java.util.Scanner;

/**
 *
 * @author Bryant
 */
public class StartProgramView {
    public StartProgramView() {
        
    }
    public void startProgram() {
        this.DisplayBanner();
        String playersName = this.getPlayersName();
        Player player = ProgramControl.createPlayer(playersName);
        this.displayWelcomeMessage(player);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
      
} 


    public String getPlayersName() {
            boolean valid = false; 
            String playersName = null;
            Scanner keyboard = new Scanner(System.in);
            
            while(!valid) {
            
                System.out.println("Enter Your Name Below:");
                
                playersName = keyboard.nextLine();
                playersName = playersName.trim();
                
                if (playersName.length() <2) {
                    System.out.println("Invalid Name - Try Again");
                    continue;
                }
                break;
        
    }
            return playersName;
    
}

    private void DisplayBanner() {
        System.out.println("\n***************************************************");
        System.out.println("* Welcome To The Hobbit Game                       *"
        +                  "\n* In this game you have been challenged to defeat *"
        +                  "\n* the evil dragon Smaug. First you must buy the   *"
        +                  "\n* euipment you need to defeat him. Then you must  *"
        +                  "\n* train with the neccesary skills to deafeat your *"
        +                  "\n* foe. Good Luck.                                 *"
        +                  "\n***************************************************");
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n ************************************");
        System.out.println("\n  Welcome To Bag End " + player.getName());
        System.out.println("\n  Now, Go And Defeat Your Foe.     ");
        System.out.println("\n ************************************");
        
    }
}
