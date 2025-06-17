package es3;
import java.util.Scanner;

public class Esercizio3 {
    Scanner scanner = new Scanner(System.in);

    public void InserisciParola(){
    String parola = scanner.next();
    int i = 0;
    String parolaFinale = "";
    while (!(parola.equals(":q"))) {
        while (i < parola.length()){
            parolaFinale += parola.charAt(i);
            if (i < parola.length()-1){
            parolaFinale += ",";}
            i++;
        }
        System.out.println("La parola con la virgola è " + parolaFinale);
        parola = scanner.next();
        parolaFinale = "";
        i = 0;
    }


    }
}
