import java.util.Scanner;

public class Person {

   private String namn;
   private double handikapp;
   Scanner scanner = new Scanner(System.in);


   /**
    * Metoden som tar emot data från användaren, initierar instansvariabler och returnerar dessa.
    */
   public void fakta() {
      System.out.println("Vad heter du och vad har du för handikapp ( exempel 10,3 ) ?");

      while (true){
         try {
            namn = scanner.nextLine();
            handikapp = scanner.nextDouble();
            break;
         } catch (Exception e) {
            scanner.nextLine();
            System.out.println("ops du kan bara skriva siffor i ålder, börja om med ditt namn!");
         }
      }
      System.out.println("Hej " + namn + " du har " + handikapp + " i handikapp");

   }
}

