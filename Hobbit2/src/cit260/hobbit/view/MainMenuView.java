/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import cit260.hobbit.control.GameControl;
import hobbit2.Hobbit2;


/**
 *
 * @author Bryant
 */
public class MainMenuView extends View {
    
    public MainMenuView() {

    super("\n"
        +                  "\n***************************************************"
        +                  "\n* N - New Game                                    *"
        +                  "\n* L - Load Saved Game                             *"
        +                  "\n* S - Save Game                                   *"
        +                  "\n* H - Help Menu                                   *"
        +                  "\n* Q - Quit                                        *"
        +                  "\n***************************************************");
}
 
    @Override
    public boolean doAction(Object obj) {
    char value = (char) obj;
    
    value = Character.toUpperCase(value);
        switch (value){
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
                return false;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        return false;
    }

    private void startNewGame() {
     GameControl.createNewGame(Hobbit2.getPlayer());
     
     BackStoryView backStory = new BackStoryView();
     backStory.display();
     
     
     GameMenuView gameMenu = new GameMenuView();
     gameMenu.display();
         }

    private void startExistingGame() {
  System.out.println("\n **** StartExistingGameFunction ******");
    }

    private void displayHelpMenu() {
     
     HelpMenuView helpMenu = new HelpMenuView();
     helpMenu.display();
    }

    private void saveGame() {
  System.out.println("\n **** SaveGameFunction ******");    
    }
    }
   
    
    

