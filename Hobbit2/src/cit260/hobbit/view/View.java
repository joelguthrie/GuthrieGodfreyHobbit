/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import java.util.Scanner;

/**
 *
 * @author Bryant
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        char selection = ' ';
        do {
            System.out.println(promptMessage);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
        }
        while (selection != 'Q');
        
        }
    @Override
    public String getInput() {
            boolean valid = false; 
            String choice = null;
            Scanner keyboard = new Scanner(System.in);
            
            while(!valid) {
            
                System.out.println("What would you like to do?");
                
                choice = keyboard.nextLine();
                choice = choice.trim();
                
                if (choice.length() >1) {
                    continue;
                }
                break;
        
    }
            return choice;
    
    }

    
}
