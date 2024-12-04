import java.util.Scanner;

public class ImpiegatoTest {

    public static void main(String[] args){
        Impiegato Imp1;


        //importiamo la classe scanner per leggere in input da tastiera
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome del dipendente: ");
        String Nome = sc.next();

        System.out.println("Inserisci il cognome del dipendente: ");
        String Cognome = sc.next();

        System.out.println("Inserisci le ore di lavoro del dipendente: ");
        int Ore = sc.nextInt();

        //assegniamo i nostri imput da tastiera come variabili passate al costruttore
        Imp1 = new Impiegato(Nome, Cognome, Ore);


        //metodo per stampare tutte le informazioni dell'impiegato
        Imp1.stampaImpiegato();

        // metodo per "settare" il costo per ore di ciascun impiegato
        Imp1.setCostoOrario(10);

        Imp1.stampaImpiegato();


        // prova del metodo getNome e del SetOre
        System.out.println(Imp1.getNome());
        Imp1.setOreLavoro(138);

        Imp1.stampaImpiegato();

    }
}
