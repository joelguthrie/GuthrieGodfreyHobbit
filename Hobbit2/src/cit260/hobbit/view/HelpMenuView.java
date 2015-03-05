/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

/**
 *
 * @author joel
 */
public class HelpMenuView extends View {
    


  public HelpMenuView(){
      super ( "\n"
        +                  "\n***************************************************"
        +                  "\n* G - Display the game Objective                  *"
        +                  "\n* D - Directions on obtaining Gold                *"
        +                  "\n* S - Directions on purchasing Supplies           *"
        +                  "\n* T - Direction on Training                       *"
        +                  "\n* F - How to fight the Dragon                     *"
        +                  "\n* M - Satus Menu                                  *"
        +                  "\n* A - Addition Problem                            *"

          +               "\n* Q - Quit the Help Menu                          *"
        +                  "\n***************************************************");
  }
      
    @Override
    public boolean doAction(Object obj) {
    char value = (char) obj;
    
    
        switch (value){
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
                return false;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        return false;
    
        
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