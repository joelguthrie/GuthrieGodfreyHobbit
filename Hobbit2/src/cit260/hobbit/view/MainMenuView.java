/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import cit260.hobbit.control.GameControl;
import hobbit2.Hobbit2;
import java.util.Scanner;

/**
 *
 * @author Bryant
 */
public class MainMenuView {

    private final String MENU = "\n"
        +                  "\n***************************************************"
        +                  "\n* N - New Game                                    *"
        +                  "\n* L - Load Saved Game                             *"
        +                  "\n* S - Save Game                                   *"
        +                  "\n* H - Help Menu                                   *"
        +                  "\n* Q - Quit                                        *"
        +                  "\n***************************************************";
      
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }
        while (selection != 'Q');
        
        }

    private String getInput() {
            boolean valid = false; 
            String choice = null;
            Scanner keyboard = new Scanner(System.in);
            
            while(!valid) {
            
                System.out.println("What would you like to do?");
                
                choice = keyboard.nextLine();
                choice = choice.trim();
                
                if (choice.length() >2) {
                    continue;
                }
                break;
        
    }
            return choice;
    
    }

    public void doAction(char choice) {
        switch (choice){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        }

    private void startNewGame() {
     GameControl.createNewGame(Hobbit2.getPlayer());
     
     GameMenuView gameMenu = new GameMenuView();
     gameMenu.displayMenu();
         }

    private void startExistingGame() {
  System.out.println("\n **** StartExistingGameFunction ******");
    }

    private void displayHelpMenu() {
  System.out.println("\n **** DisplayHelpMenuFunction ******");
    }

    private void saveGame() {
  System.out.println("\n **** SaveGameFunction ******");    
    }
    }
   
    
    

