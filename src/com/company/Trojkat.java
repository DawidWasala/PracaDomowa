package com.company;


public class Trojkat {
    private double surface;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public void getDimensions(){
        System.out.println("Jakies masz informacje ?");
        System.out.println("1 - bok i wysokosc");
        System.out.println("2 - wszystkie 3 boki");
        int choice = Main.doubleScanner.nextInt();
        if(choice == 1){
            setSurfaceWithSideAndHeight();
        }
        else if(choice == 2){
            setSurfaceWithThreeSides();
        }

    }
    public void setSurfaceWithSideAndHeight(){
        System.out.println("Wpisz bok");
        sideA = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz wysokosc");
        height = Main.doubleScanner.nextDouble();
    }
    public void setSurfaceWithThreeSides(){
        System.out.println("Wpisz pierwszy bok");
        sideA = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz drugi bok");
        sideB = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz trzeci bok");
        sideC = Main.doubleScanner.nextDouble();
        surface = (Math.sqrt((sideA+sideB+sideC)*(sideA+sideB-sideC)*(sideA-sideB+sideC)*(-sideA+sideB+sideC)))/4;   // wzor Herona
    }
    public double getSurface(){
        return surface;
    }
}
