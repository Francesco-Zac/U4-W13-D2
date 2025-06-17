package es4;
import java.util.Scanner;

public class Esercizio4 {
    Scanner scanner = new Scanner(System.in);

    public void InserisciUnNumero(){
        int numero = scanner.nextInt();
        for (int i = numero; i >= 0 ; i--){
            System.out.println(i);
        }

    }
}
