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
public class Cube {
    
    int height = 5;
    int width = 10;
    int surfaceArea = (height * width) * 6;
    
    public int getSurfaceArea(){
    
    return surfaceArea;
    
    }
    
    public void setSurfaceArea(int sa){
    
        surfaceArea = sa;
    
    }
}
