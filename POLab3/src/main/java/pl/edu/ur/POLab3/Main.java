/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Arrays;

/**
 *
 * @author Asia
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        
        //zadanie 1.4
//        int a=5;
//        System.out.println("wartosc a: "+a);
//        a = a>>1;
//        System.out.println("wartosc a po przesunieciu w prawo o 1: "+a);
//        a = a<<1;
//        System.out.println("wartosc a po przesunieciu w lewo o 1: "+a);
//        a = a>>>1;
//        System.out.println("wartosc a po przesunieciu w prawo bez znaku o 1: "+a);
        //zadanie 1.7
//        boolean a,b,c;
//        a=false;
//        b=true;
//        c = a^b;
//        System.out.println(a+" XOR "+b+" = "+ c);
//        System.out.println(c+" NOT "+" = "+!c);
        //zadanie 2.2
                String x = "a";
                String y = "b";

                System.out.println(x.toCharArray()); //zamienia string na char
                System.out.println(Arrays.toString(x.getBytes())); //koduje string do nowej tablicy bajtów
                System.out.println(x.equals(y)); //porównuje 2 stringi oraz sprawdza czy sa takie same
                System.out.println(x.equalsIgnoreCase(y)); //porównuje 2 stringi nie zwracając uwagi na wielkość liter
                System.out.println(x.compareTo(y)); //porównuje 2 stringi lexykograficznie
                System.out.println(x.compareToIgnoreCase(y)); //porównuje 2 stringi lexykograficznie z pominięciem wielkości liter
                System.out.println("c" + y.indexOf('t')); //wyznacza miejsce znaku
                System.out.println(x.indexOf(y)); //wyznacza indeks w pierwszym stringu z drugiego
                System.out.println(x.lastIndexOf(y)); //wyznacza miejsce ostatniego znaku w stringu
                System.out.println(x.substring(2)); //tworzy podciąg z innego stringu
                System.out.println(y.substring(3, 4)); //tworzy podciąg z innego stringu w przedziale
                System.out.println(x.replace('a', 'b')); //wymienia podane znaki w inne 
                System.out.println(x.trim()); //zamienia znak na bez spacji
                System.out.println(x.toLowerCase()); //zamienia znaki na male litery
                System.out.println(x.toUpperCase()); //zamienia znaki na duze litery
        //zadanie 3.3
        //iteracja
//        System.out.println("zad3.3");
//
//        int liczba, potega;
//        System.out.println("podaj liczbe w wykładniku");
//        liczba = scanner.nextInt();
//        System.out.println("podaj liczbe w potedze");
//        potega = scanner.nextInt();
//
//        int wynik = potegowanie(liczba,potega);
//
//
//        //petegowanie rekurencyjne
//        System.out.println("podaj liczbe w wykładniku");
//        liczba = scanner.nextInt();
//        System.out.println("podaj liczbe w potedze");
//        potega = scanner.nextInt();
//
//        System.out.println(potega_rekurencyjna(liczba,potega));
    //zadanie 3.4    
    }
}