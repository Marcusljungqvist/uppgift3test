import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        int fråga;


        System.out.println("välkommen till golfprogrammet!");

        /*
         * Anropar metoden person.fakta()
         */
        person.fakta();


        while (true) {
            System.out.println("hur långt slår du en järn 7a i meter?");
            try {
                Golf.medellängd = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Meter kan bara skrivas i siffror, försök igen");
            }
        }

        System.out.println("Du har " + Golf.vind + "meter per sekund" + " i motvind vilken ger 10% mindre längd");

        while (true) {
            System.out.println("Hur långt har du till hålet ?");
            System.out.println("-----------------------------");
            while (true) {

                try {
                    Golf.meterkvar = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("ops du kan bara skriva siffor i meter, försök igen!");
                }
            }
            System.out.println("-----------------------------");
            double[] längdpåjärnsjuan = Golf.klubba(Golf.medellängd); //räkna ut längden på järnsjuan
            double[] vind = Golf.vind(längdpåjärnsjuan); //lägg på vinden
            double vilkenklubba = Golf.längduträkning(vind); // vilken klubba ska jag använda?

            while (true) {
                try {
                    System.out.println("\nSkriv '1' för att slå igen eller '2' för att avsluta.");
                    fråga = scanner.nextInt();
                    if (fråga == 1 || fråga == 2)
                        break;
                } catch (Exception e) {
                    scanner.next();
                    System.out.println("Något blev fel!, försök igen.");
                }
            }

            switch (fråga) {
                case 1:
                    break;
                case 2:
                    System.exit(0);

            }
        }
    }
}