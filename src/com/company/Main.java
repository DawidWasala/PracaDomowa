package com.company;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Double> wyniki = new ArrayList<Double>();
    public static List<String> dzialanie = new ArrayList<String>();
    public static Scanner stringScanner = new Scanner(System.in);
    public static Scanner doubleScanner = new Scanner(System.in);

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("wybierz dzialanie: kolo, prostokat, kwadrat, romb, trapez, trojkat");
            if (i > 0) {
                System.out.println("lub wpisz stop aby zakonczyc obliczenia");
            }
            String figure = stringScanner.nextLine();

            if (figure.equals("kolo") || figure.contains("kolo")) {                      // kolo
                Kolo kolo = new Kolo();
                kolo.getRadius();
                wyniki.add(kolo.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("kwadrat") || figure.contains("kwadrat")) {         // kwadrat
                Kwadrat kwadrat = new Kwadrat();
                try {
                    kwadrat.getDimensions();
                } catch (InputMismatchException e) {
                    System.out.println("Podales zly numer");
                    continue;
                }
                wyniki.add(kwadrat.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("prostokat") || figure.contains("prostokat")) {      // prostokat
                Prostokat prostokat = new Prostokat();
                prostokat.getDimensions();
                wyniki.add(prostokat.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("romb") || figure.contains("romb")) {                // romb
                Romb romb = new Romb();
                try {
                    romb.getDimensions();
                } catch (InputMismatchException e) {
                    System.out.println("Podales zly numer");
                    continue;
                }
                wyniki.add(romb.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("trapez") || figure.contains("trapez")) {            // trapez
                Trapez trapez = new Trapez();
                trapez.getDimensions();
                wyniki.add(trapez.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("trojkat") || figure.contains("trojkat")){
                Trojkat trojkat = new Trojkat();
                trojkat.getDimensions();
                wyniki.add(trojkat.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            }
            else if (figure.equals("stop")) {
                break;
            }
//            else{
//                System.out.println("cos zle zrobiles i zaczynasz od nowa xd");
//                break;
//          }
        }
        for (int i = 0; i < wyniki.size(); i++)

        {
            System.out.println(dzialanie.get(i) + " = " + wyniki.get(i));
        }
    }

}
