/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class StatusMenuVeiw {
    double gold = 0;
    
    private final String Status = "\n"
        +                  "\n***************************************************"
        +                  "\n* Gold                                        /10 *"
        +                  "\n* Gold Pouch                                   /1 *"    
        +                  "\n* Attack Experince                            /10 *"
        +                  "\n* Defense Experince                           /10 *"
        +                  "\n* Experience Medallion                         /1 *"
        +                  "\n* Sword                                        /1 *"
        +                  "\n* Armor                                        /1 *"
        +                  "\n*                                                 *"    
        +                  "\n* Q - Quit                                        *"
        +                  "\n***************************************************";
        
        public void displayStatusMenu() {
        char selection = ' ';
        do {
            System.out.println(Status);
            
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
        private void doAction(char choice) {
        switch (choice){
             
            case 'Q':
                return;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
    }
}
