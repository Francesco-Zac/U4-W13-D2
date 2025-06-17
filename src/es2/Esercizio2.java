package es2;

import java.util.Scanner;

public class Esercizio2 {
    Scanner scanner = new Scanner(System.in);

    public void IntIngresso (int num){
        switch (num){
            case 0:
                System.out.println("Zero");break;
            case 1:
                System.out.println("Uno");break;
            case 2:
                System.out.println("Due");break;
            case 3:
                System.out.println("Tre");break;

            default:
                System.out.println("Perfavore inserisci un numero compreso tra 0 e 3");
        }
    }
}
