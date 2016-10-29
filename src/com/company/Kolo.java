package com.company;

/**
 * Created by Dawid on 2016-10-29.
 */
public class Kolo {

    private double radius;
    private double surface;

    public void getRadius() {
        System.out.println("Wpisz promien");
        radius = Main.doubleScanner.nextDouble();

    }

    public void setSurface() {
        surface = Math.pow(radius, 2) * Math.PI;
    }
    public double getSurface(){
        setSurface();
        return surface;
    }

}
