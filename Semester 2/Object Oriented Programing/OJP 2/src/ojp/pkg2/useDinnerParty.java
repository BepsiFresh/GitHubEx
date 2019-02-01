/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojp.pkg2;

import java.util.Scanner;

/**
 *
 * @author Dorian
 */
public class useDinnerParty {
    public static void main(String[] args){
    
        int guests;
        int choice;
        party aParty = new party();
        DinnerParty aDinnerParty = new DinnerParty();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        
        aParty.setGuests(guests);
        
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        aParty.displayInvitation();
        
        System.out.println("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        
        System.out.print
        ("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        
        System.out.println("The dinner party has " + 
                aDinnerParty.getGuests() + " guests");
        
        System.out.println("Menu option " +
                aDinnerParty.getDinnerChoice() + " will be served");
        
        aDinnerParty.displayInvitation();
    
    }
}
