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
    public static double wheelInscribed;
    public static double wheelDescribed;
    private static double wynik;
    public static int numberOfBiggestDescribedWheel;
    public static int numberOfBiggestInscribedWheel;
    public static int i = 0;


    public static void main(String[] args) {


        for (i = 0; i < 10000; i++) {
            System.out.println("wybierz dzialanie: kolo, prostokat, kwadrat, trapez, trojkat");   // prosze nie uzywac rombu xd
            if (i > 0) {
                System.out.println("lub wpisz stop aby zakonczyc obliczenia");
            }
            String figure = stringScanner.nextLine();

            if (figure.equals("kolo") || figure.contains("kolo")) {                      // kolo
                Kolo kolo = new Kolo();
                kolo.getRadius();
                wyniki.add(kolo.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
                kolo.wheelDescribed();
                kolo.wheelInscribed();
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
                kwadrat.wheelDescribed();
                kwadrat.wheelInscribed();
            } else if (figure.equals("prostokat") || figure.contains("prostokat")) {      // prostokat
                Prostokat prostokat = new Prostokat();
                prostokat.getDimensions();
                wyniki.add(prostokat.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
                prostokat.wheelInscribed();
                prostokat.wheelDescribed();
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
                trapez.wheelDescribed();
                trapez.wheelInscribed();
            } else if (figure.equals("trojkat") || figure.contains("trojkat")) {
                Trojkat trojkat = new Trojkat();
                trojkat.getDimensions();
                wyniki.add(trojkat.getSurface());
                dzialanie.add("wynik " + i + " - (" + figure + "):");
                trojkat.wheelDescribed();
                trojkat.wheelInscirbed();
            } else if (figure.equals("stop")) {
                break;
            }
            else{
                System.out.println("cos zle zrobiles i zaczynasz od nowa xd");
          }
        }
        for (int i = 0; i < wyniki.size(); i++)

        {
            System.out.println(dzialanie.get(i) + " = " + wyniki.get(i));
        }
        for (int i = 0; i < wyniki.size(); i++) {
            wynik += wyniki.get(i);

        }
        System.out.println("Suma wszystkich wynikow to: "+wynik);
        System.out.println("Najwiekszy okrag mozna wpisac w: "+dzialanie.get(numberOfBiggestDescribedWheel)+" o promieniu: "+wheelDescribed);
        System.out.println("Najmniejszy okrag mozna wpisac w: "+dzialanie.get(numberOfBiggestInscribedWheel)+" o promieniu: "+wheelInscribed);
    }

}

/** ogolnie to nie wiedzialem o co chodzi za bardzo w tej pracy domowej
 * wiec zrobilem na poczatku po swojemu, ale potem pomyslalem ze chodzilo o cos innego
 * i dodalem ta metode z sumowaniem wynikow. xd
  */
