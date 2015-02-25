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
public class HelpMenuView {
    


    private final String MENU = "\n"
        +                  "\n***************************************************"
        +                  "\n* G - Display the game Objective                  *"
        +                  "\n* D - Directions on obtaining Gold                *"
        +                  "\n* S - Directions on purchasing Supplies           *"
        +                  "\n* T - Direction on Training                       *"
        +                  "\n* F - How to fight the Dragon                     *"
        +                  "\n* M - Satus Menu                                  *"
        +                  "\n* A - Addition Problem                            *"

          +               "\n* Q - Quit the Help Menu                          *"
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

    private void doAction(char choice) {
        switch (choice){
            case 'G':
                this.displayObjective();
                break;
            case 'D':
                this.goldDirections();
                break;
            case 'S':
                this.suppliesDirections();
                break;
            case 'T':
                this.trainingDirections();
                break;
            case 'F':
                this.fightingDirections();
                break;  
            case 'M':
                this.StatusMenu();
                break;  
            case 'A':
                this.AdditionProblem();
                break;  
            case 'Q':
                return;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
    }

    private void displayObjective() {
System.out.println("\n **** displayObjective stub called ******");  
    }

    private void goldDirections() {
 System.out.println("\n **** goldDirections stub called ******");   }

    private void suppliesDirections() {
 System.out.println("\n **** supplies stub called ******");         
    }

    private void trainingDirections() {
 System.out.println("\n **** taining stub called ******");  
    }

    private void fightingDirections() {
System.out.println("\n **** fighting stub called ******");  
    }

    private void StatusMenu() {
     StatusMenuVeiw statusMenu = new StatusMenuVeiw();
     statusMenu.displayStatusMenu();
    }

    private void AdditionProblem() {
      AskAdditionProblem additionProblem = new AskAdditionProblem();
      additionProblem.displayAdditionProblem();
    }
}