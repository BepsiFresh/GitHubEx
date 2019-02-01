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
public class Textbook extends Book{
    
        private int gradeLevel;
    
    public int getGradeLevel(){
        
        return gradeLevel;
    
    }
    
    public void setGradeLevel(int grade){
    
        gradeLevel = grade;
    
    }
    
    private int pages;
    
    public int getPages(){
    
    return pages;
    
    }
    
    public void setPages(int numPages){
    
        pages = numPages;
    
    }
    
}
