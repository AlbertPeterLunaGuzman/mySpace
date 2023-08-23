/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geometriccalculator;
import java.util.*;
/**
 *
 * @author Albert
 */
public class GeometricCalculator {

    public static void main(String[] args) {
        myTriangle();
        mySquare();
    }

        private static void myTriangle(){
        
            Scanner triangleScanner = new Scanner(System.in);
            double height, side, side1, side2;
            
            System.out.print("Eneter the value for Base: ");
            side1 = triangleScanner.nextDouble();
            
            System.out.print("Eneter the value for Height: ");
            height = triangleScanner.nextDouble();
            
            System.out.print("Eneter the value for side: ");
            side = triangleScanner.nextDouble();
            
            System.out.print("Eneter the value for Side2: ");
            side2 = triangleScanner.nextDouble();
            
            
            triangle triangle = new triangle(side1, height, side, side2);
            triangle.displayInfo();

        }
        
        private static void mySquare(){
            Scanner squareScanner = new Scanner(System.in); 
            
            System.out.print("Eneter the value for Base: ");
            double side = squareScanner.nextDouble();
            
            square square = new square(6.0);
            square.displayInfo();
    
        }
}
