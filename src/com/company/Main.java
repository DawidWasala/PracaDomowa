package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Double> wyniki = new ArrayList<Double>();
    public static List<String> dzialanie = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    // pobranie informacji
        Scanner doubleScanner = new Scanner(System.in);    // pobreanie informacji v2 bo bartek tak mowil na double

        for (int i = 0; i < 10; i++) {
            System.out.println("wybierz dzialanie: kolo, prostokat, kwadrat, romb");
            if (i > 0) {
                System.out.println("lub wpisz stop aby zakonczyc obliczenia");
            }
            String figure = scanner.nextLine();

            if (figure.equals("kolo") || figure.contains("kolo")) {              // kolo
                System.out.println("Wpisz promien");
                double r = doubleScanner.nextDouble();
                double wynik = r * r * Math.PI;
                wyniki.add(wynik);
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("prostokat") || figure.contains("prostokat")) {         // prostokat
                System.out.println("Wpisz dlugosc boku");
                double a = doubleScanner.nextDouble();
                System.out.println("Wpisz szerokosc boku");
                double b = doubleScanner.nextDouble();
                double wynik = a * b;
                wyniki.add(wynik);
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("kwadrat") || figure.contains("kwadrat")) {           // kwadrat
                System.out.println("Jakie masz dane ?");
                System.out.println("1 - bok");
                System.out.println("2 - dlugosc przekatnej");
                double wynik = 0;
                int choice = doubleScanner.nextInt();
                if (choice == 1) {                                        // if  bok
                    System.out.println("Wpisz dlugosc boku");
                    double a = doubleScanner.nextDouble();
                    wynik = a * a;
                } else if (choice == 2) {                                   // if przekatna
                    System.out.println("Wpisz dlugosc przekatnej");
                    double e = doubleScanner.nextDouble();
                    wynik = (e * e) / 2;
                }
                wyniki.add(wynik);
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("romb") || figure.contains("romb")) {           // romb
                System.out.println("Jakie masz dane ?");
                System.out.println("1 - bok i wysokosc");
                System.out.println("2 - dlugosci przekatnych");
                double wynik = 0;
                int choice = doubleScanner.nextInt();
                if (choice == 1) {                                    // if bok i wysokosc
                    System.out.println("Wpisz bok");
                    double a = doubleScanner.nextDouble();
                    System.out.println("Wpisz wysokosc");
                    double h = doubleScanner.nextDouble();
                    wynik = a * h;
                } else if (choice == 2) {                               // if przekatne
                    System.out.println("Wpisz pierwsza przekotna");
                    double e = doubleScanner.nextDouble();
                    System.out.println("Wpisz druga przekatna");
                    double f = doubleScanner.nextDouble();
                    wynik = e * f / 2;
                }
                wyniki.add(wynik);
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("trapez") || figure.contains("trapez")) {
                System.out.println("Wpisz dlugosc pierwszej podstawy");
                double a = doubleScanner.nextDouble();
                System.out.println("Wpisz dlugosc drugiej podstawy");
                double b = doubleScanner.nextDouble();
                System.out.println("Wpisz wysokosc");
                double h = doubleScanner.nextDouble();
                double wynik = ((a + b) * h) / 2;
                wyniki.add(wynik);
                dzialanie.add("wynik " + i + " - (" + figure + "):");
            } else if (figure.equals("stop")) {
                break;
            }
//            else{
//                System.out.println("cos zle zrobiles i zaczynasz od nowa xd");
//                break;
//          }
        }
        for (int i = 0; i < wyniki.size(); i++) {
            System.out.println(dzialanie.get(i) + " = " + wyniki.get(i));
        }
    }

}
