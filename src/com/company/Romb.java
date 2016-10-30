package com.company;

import java.util.InputMismatchException;


public class Romb {

    private double surface;

    public void getDimensions() throws InputMismatchException {
        System.out.println("Jakie masz dane ?");
        System.out.println("1 - bok i wysokosc");
        System.out.println("2 - dlugosci przekatnych");
        int choice = Main.doubleScanner.nextInt();
        if (choice == 1) {
            setSurfaceWithSide();
        } else if (choice == 2) {
            setSurfaceWithDiagonal();
        }
        throw new InputMismatchException();

    }

    public void setSurfaceWithSide() {
        System.out.println("Wpisz bok");
        double side = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz wysokosc");
        double height = Main.doubleScanner.nextDouble();
        surface = height * side;
    }

    public void setSurfaceWithDiagonal() {
        System.out.println("Wpisz pierwsza przekatna");
        double diagonal1 = Main.doubleScanner.nextDouble();
        System.out.println("Wpisz druga przekatna");
        double diagonal2 = Main.doubleScanner.nextDouble();
        surface = (diagonal1 * diagonal2) / 2;

    }

    public double getSurface() {

        return surface;
    }
}
