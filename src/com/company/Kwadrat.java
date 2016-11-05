package com.company;

import java.util.InputMismatchException;


public class Kwadrat {

    private double side;
    private double diagonal;
    private double surface;

    public void getDimensions()throws InputMismatchException{
        System.out.println("Jakie masz dane ?");
        System.out.println("1 - bok");
        System.out.println("2 - dlugosc przekatnej");
        int choice = Main.doubleScanner.nextInt();
        if(choice == 1){
            setSurfaceWithSide();
        }
        else if(choice == 2){
            setSurfaceWithDiagonal();
        }
        else throw new InputMismatchException();
    }
    private void setSurfaceWithSide(){
        System.out.println("Wpisz bok");
        surface = Math.pow(Main.doubleScanner.nextDouble(), 2);
        diagonal = Math.sqrt(2)*side;
    }
    private void setSurfaceWithDiagonal(){
        System.out.println("Wpisz przekatna");
        diagonal = Main.doubleScanner.nextDouble();
        surface = (Math.pow(diagonal,2))/2;
        side = Math.sqrt(surface);
    }
    public double getSurface(){

        return surface;
    }
    public void wheelDescribed(){
        if(diagonal/2 > Main.wheelDescribed){
            Main.wheelDescribed = diagonal/2;
            Main.numberOfBiggestDescribedWheel= Main.i;
        }
    }
    public void wheelInscribed(){
        if(side/2 > Main.wheelInscribed){
            Main.wheelInscribed = side/2;
            Main.numberOfBiggestInscribedWheel= Main.i;
        }
    }
}
