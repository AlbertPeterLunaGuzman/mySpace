/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometriccalculator;

/**
 *
 * @author Albert
 */
public class square implements GeometricShape {
    double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.side;
    }

    @Override
    public void displayInfo() {
        System.out.println("Area of the Square: " + calculateArea());
        System.out.println("Perimeter of the Square: " + calculatePerimeter());
    }
}
