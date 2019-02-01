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
import java.util.*;
public class useParty {
    public static void main(String[] args){
    
        int guests;
        party aParty = new party();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        
        aParty.setGuests(guests);
        
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        aParty.displayInvitation();
    
    }
    
}
