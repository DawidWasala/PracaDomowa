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
        setSurface();
        return surface;
    }
    public void wheelInscribed(){
        if(sideA<sideB){
            if(sideA/2 > Main.wheelInscribed){
                Main.wheelInscribed = sideA/2;
                Main.numberOfBiggestInscribedWheel= Main.i;
            }

        }else{
            if(sideB/2 > Main.wheelInscribed){
                Main.wheelInscribed = sideB/2;
                Main.numberOfBiggestInscribedWheel= Main.i;
            }
        }
    }
    public void wheelDescribed(){
        if(Math.sqrt((sideA*sideA)+(sideB*sideB)) > Main.wheelDescribed){
            Main.wheelDescribed = Math.sqrt((sideA*sideA)+(sideB*sideB));
            Main.numberOfBiggestDescribedWheel= Main.i;
        }
    }
}
