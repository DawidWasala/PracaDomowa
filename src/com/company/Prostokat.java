package com.company;


public class Prostokat {

    private double surface;
    private double sideA;
    private double sideB;

    public void getDimensions(){
        System.out.println("Wpisz pierwszy bok");
        sideA = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz drugi bok");
        sideB = Main.doubleScanner.nextDouble();

    }
    private void setSurface(){
        surface = sideA*sideB;
    }
    public double getSurface(){
        return surface;
    }
}
