/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojp.pkg2;

/**
 *
 * @author Dorian
 */
    public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {
    
    private int dinnerChoice;
    
    public int getDinnerChoice(){
        
        return dinnerChoice;
    
    }
    
    public void setDinnerChoice(int choice){
    
        dinnerChoice = choice;
    
    }
    
    public DinnerPartyWithConstructor2(int numGuests){
    
        super(numGuests);
    
    }
    
    @Override
    public void displayInvitation(){
    
        System.out.println("Please come to my dinner party!");
    
    }
    
}

