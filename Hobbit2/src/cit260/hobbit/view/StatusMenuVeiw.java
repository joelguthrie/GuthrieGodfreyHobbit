/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

import cit260.hobbit.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author joel
 */
public class StatusMenuVeiw {

    private void viewInventory(){
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Descritption" + "\t" +
                           "Required" + "\t" + 
                           "In Stock");
        
        for (InventoryItem inventoryItem : inventory) {
            
            System.out.println(inventoryItem.getDescription() + "\t     "+
                            inventoryItem.getRequiredAmount() + "\t     "+
                            inventoryItem.getQuantityInStock());
        }
        
    }
    
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
