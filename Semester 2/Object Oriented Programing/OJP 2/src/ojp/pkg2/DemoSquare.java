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
public class DemoSquare {
    public static void main(String[] args){
    Square aSquare = new Square();
    Cube aCube = new Cube();
    
    System.out.println("The Surface Area of the square is " 
            + aSquare.getSurfaceArea());
    System.out.println("The Surface Area of the cube is " 
            + aCube.getSurfaceArea());
    }
}
