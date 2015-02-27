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
public class AskDivisionProblem {
    
private final String division1 = "\n"
        +                  "\n What is 78 / 6?"
        +                  "\n***************************************************";
      
    public void displayDivisionProblem() {
        
            System.out.println(division1);
            char selection = ' ';
            int input = this.getInput();

            
            this.doAction(input);
        
        
        }
    
        private Integer getInput() {
           
                System.out.println("What is the answer?");
                
                Scanner scan = new Scanner(System.in); 
                int answer = scan.nextInt(); 
                
            return answer;
    
    }
        private void doAction(int answer) {
        if (answer == 13)
                this.addGold();

        else{
                System.out.println("\n **** Wrong Answer ******");        
        }
        }
    private void addGold() {
        System.out.println("\n **** addGold stubFunction here******");
    }
}
