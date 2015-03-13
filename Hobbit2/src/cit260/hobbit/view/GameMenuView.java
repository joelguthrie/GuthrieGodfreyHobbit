/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.hobbit.view;

/**
 *
 * @author Bryant
 */
 public class GameMenuView extends View {
    
      public GameMenuView(){
      super ( "\n"
        +                  "\n***************************************************"
        +                  "\n* D - Display Map                                 *"
        +                  "\n* V - View Inventory                              *"
        +                  "\n* Q - Quit the Help Menu                          *"
        +                  "\n***************************************************");
      }
    @Override
    public boolean doAction(Object obj) {
    char value = (char) obj;
    
   value = Character.toUpperCase(value);
        switch (value){

            case 'D':
                this.displayMap();
                break;
            case 'V':
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

    private void MapLocationView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap() {
        
    }
   

   
        
    }

    
    


