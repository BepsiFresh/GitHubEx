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
public class DinnerParty2 extends party{
    
    private int dinnerChoice;
    
    public int getDinnerChoice(){
        
        return dinnerChoice;
    
    }
    
    public void setDinnerChoice(int choice){
    
        dinnerChoice = choice;
    
    }
    
    @Override
    public void displayInvitation(){
    
        System.out.println("Please come to my dinner party!");
    
    }
    
}
