package es1;

public class Esercizio1 {
    public boolean StringaPari(String stringa){
        if (stringa.length() % 2 == 0){
            System.out.println("La stringa è pari");
            return true;}
        else {
            System.out.println("La stringa è dispari");
            return false;}
    }

    public boolean AnnoBisestile(int anno){
        if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0){
            System.out.println("L'Anno è bisestile'");
            return true;}
        else {
            System.out.println("L'Anno non è bisestile");
            return false;}
    }
}
