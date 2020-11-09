import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        Golf golf = new Golf();



        /**
         * Anropar instansmetoden person.fakta som bestämmer namn och handikapp
         */

        person.fakta();
        /**
         * Detta segment kör metoden Golf.medellängd som sätter värdet-
         * -på hur många meter användaren slår med en Järn 7a
         */

        while (true) {
            System.out.println("hur långt slår du en järn 7a i meter?");
            try {
                golf.medellängd = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Meter kan bara skrivas i siffror, försök igen");
            }
        }
        System.out.println("Du har " + golf.vind + "meter per sekund" + " i motvind vilken ger 10% mindre längd");

        /**
         * Detta segment ska upprepas så länge spelaren är på golfbanan -
         * - men kan även avslutas om spelaren har spelat färdigt
         * Anropar metoden Golf.meterkvar som sätter värdet på hur många meter man har till hålet
         */
        while (true) {
            System.out.println("Hur långt har du till hålet ?");
            System.out.println("-----------------------------");
            while (true) {

                try {
                    golf.meterkvar = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("ops du kan bara skriva siffor i meter, försök igen!");
                }
            }
            System.out.println("-----------------------------");

            double[] klubbornaslängd = golf.klubba(golf.medellängd); //räkna ut längden på klubborna
            double[] vind =  golf.vind(klubbornaslängd); //lägg på vinden
            double vilkenklubba = golf.längduträkning(vind); // vilken klubba ska jag använda?

            /**
             * anropar instansmetoden golf.fråga
             */
            golf.fråga();


        }
    }
}
