package com.company;


import static com.company.Main.wheelDescribed;
import static com.company.Main.wheelInscribed;

public class Trapez {

    private double sideA;
    private double sideB;
    private double surface;
    private double height;

    public void getDimensions() {
        System.out.println("Zakladamy ze trapez jest rownoramienny.");
        System.out.println("Wpisz pierwsza podstawe");
        sideA = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz druga podstawe");
        sideB = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz wysokosc");
        height = Main.doubleScanner.nextDouble();


    }

    private void setSurface() {
        surface = ((sideA + sideB) * height) / 2;

    }
    public double getSurface()
    {
        setSurface();
        return surface;
    }
    public void wheelDescribed(){
        if (Math.sqrt((sideA * sideB + Math.pow((sideA + sideB) / 2, 2)) * Math.pow((sideA + sideB) / 2, 2) / 4 * sideA * sideB) > Main.wheelDescribed){
            Main.wheelDescribed = Math.sqrt((sideA * sideB + Math.pow((sideA + sideB) / 2, 2)) * Math.pow((sideA + sideB) / 2, 2) / 4 * sideA * sideB);
        }

    }
    public void wheelInscribed(){
        if (Math.sqrt(sideA * sideB) / 2 > Main.wheelInscribed){
            Main.wheelInscribed = Math.sqrt(sideA * sideB) / 2;
        }
    }
}