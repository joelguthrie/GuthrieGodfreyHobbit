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
public class MapLocationView extends View {
    
      public MapLocationView(){
      super ( "\n"
        +                  "\n***************************************************"
        +                  "\n G - Location for digging gold                    *"
        +                  "\n S - Location for developing skills               *"
        +                  "\n P - Location for buying supplies                 *"
        +                  "\n D - Location for fighting dragon                 *"
        +                  "\n M - Status menu                                  *"
        +                  "\n Q - Quit Map                                     *"
        +                  "\n***************************************************");
  }
      
    @Override
    public boolean doAction(Object obj) {
    char value = (char) obj;
    
    
        switch (value){
           case 'G':
                this.goldLocation();
                break;
            case 'S':
                this.skillsLocation();
                break;
            case 'P':
                this.suppliesLocation();
                break;
            case 'D':
                this.dragonLocation();
                break;
            case 'M':
                this.StatusMenu();
                break;   
            case 'Q':
                return false;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        return false;
    
        
    }
    private void StatusMenu() {
     StatusMenuVeiw statusMenu = new StatusMenuVeiw();
     statusMenu.displayStatusMenu();
    }

    private void dragonLocation() {
System.out.println("\n **** dragon location stub called ******");      }

    private void suppliesLocation() {
System.out.println("\n **** supplies location stub called ******");      }

    private void skillsLocation() {
System.out.println("\n **** skills location stub called ******");      }

    private void goldLocation() {
System.out.println("\n **** gold location stub called ******");      }
    
    
}
