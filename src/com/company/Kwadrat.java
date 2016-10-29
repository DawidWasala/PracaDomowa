package com.company;

import java.util.InputMismatchException;

/**
 * Created by Dawid on 2016-10-29.
 */
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
    }
    private void setSurfaceWithDiagonal(){
        System.out.println("Wpisz przekatna");
        surface = (Math.pow(Main.doubleScanner.nextDouble(),2))/2;
    }
    public double getSurface(){
        return surface;
    }
}
