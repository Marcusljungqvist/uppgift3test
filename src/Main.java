import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Person person = new Person();
        medellängd medellängd = new medellängd();
        meterkvar längd = new meterkvar();
        Vind vinden = new Vind();
        int fråga = 0;


        System.out.println("välkommen till golfprogrammet!");

        while (true) {

            System.out.println("Vad heter du och vad har du för handikapp ( exempel 10,3 ) ?");

            try {
                person.namn = scanner.nextLine();
                person.handikapp = scanner.nextDouble();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("ops du kan bara skriva siffor i ålder, försök igen!");
            }
        }
        System.out.println("Hej " + person.namn + " du har " + person.handikapp + " i handikapp");
        while (true) {
            System.out.println("hur långt slår du en järn 7a i meter?");
            try {
                medellängd.medel = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Meter kan bara skrivas i siffror, försök igen");
            }
        }

        System.out.println("Du har " + vinden.vind + "meter per sekund" + " i motvind vilken ger 10% mindre längd");

        while (true) {
            System.out.println("Hur långt har du till hålet ?");
            System.out.println("-----------------------------");
            while (true) {

                try {
                    längd.längd = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("ops du kan bara skriva siffor i meter, försök igen!");
                }
            }
            System.out.println("-----------------------------");
            double[] längdpåjärnsjuan = uträkning.klubba(medellängd.medel); //räkna ut längden på järnsjuan
            double[] vind = uträkning.vind(längdpåjärnsjuan); //lägg på vinden
            double vilkenklubba = uträkning.längduträkning(vind); // vilken klubba ska jag använda?

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