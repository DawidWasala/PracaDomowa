package com.company;



public class Trapez {

    private double sideA;
    private double sideB;
    private double surface;
    private double height;

    public void getDimensions(){
        System.out.println("Wpisz pierwsza podstawe");
        sideA = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz druga podstawe");
        sideB = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz wysokosc");
        height = Main.doubleScanner.nextDouble();


    }
    private void setSurface(){
        surface = ((sideA+sideB)*height)/2;

    }
    public double getSurface(){
        return surface;
    }
}