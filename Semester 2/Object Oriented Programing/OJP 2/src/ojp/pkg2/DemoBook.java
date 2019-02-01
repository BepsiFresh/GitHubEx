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
public class DemoBook {
     public static void main(String[] args){
    
        int pages;
        int grade;
        Book aBook = new Book();
        Textbook aTextbook = new Textbook();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter number of pages for the book >> ");
        pages = keyboard.nextInt();
        
        aBook.setPages(pages);
        
        System.out.println("The book has " + aBook.getPages() + " pages");
        
        System.out.print("Enter number of pages in the textbook >> ");
        pages = keyboard.nextInt();
        aTextbook.setPages(pages);
        
        System.out.print
        ("Enter the number of the appropriate grade for the textbook >> ");
        grade = keyboard.nextInt();
        aTextbook.setGradeLevel(grade);
        
        System.out.println("The textbook has " + 
                aTextbook.getPages() + " pages and is for grade " +
                aTextbook.getGradeLevel());
    
    }
}
