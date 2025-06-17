import es1.Esercizio1;
import es2.Esercizio2;
import es3.Esercizio3;
import es4.Esercizio4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------------------- ES-1 -------------------------------------------------");
    Esercizio1 esercizio1 = new Esercizio1();
    esercizio1.StringaPari("1234");
    esercizio1.AnnoBisestile(1984);

        System.out.println("------------------------------------------- ES-2 -------------------------------------------------");
    Esercizio2 esercizio2 = new Esercizio2();
    esercizio2.IntIngresso(3);


        System.out.println("------------------------------------------- ES-3 -------------------------------------------------");
    Esercizio3 esercizio3 = new Esercizio3();
    esercizio3.InserisciParola();


        System.out.println("------------------------------------------- ES-4 -------------------------------------------------");
    Esercizio4 esercizio4 = new Esercizio4();
    esercizio4.InserisciUnNumero();
    }
}