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
public class PartyWithConstructor2 {
    
     private int guests;
    
    public int getGuests(){
    
    return guests;
    
    }
    
    public void setGuests(int numGuests){
    
        guests = numGuests;
    
    }
    
    public void displayInvitation(){
    
        System.out.println("Please come to the party");
    
    }
    
    public PartyWithConstructor2(int numGuests){
    
        guests = numGuests;
        
    }
    
}