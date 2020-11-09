import java.util.Scanner;

public class Person {

   //privata Instansvariabler
   private String namn;
   private double handikapp;


   /**
    * Instansmetodmetoden som tar emot data från användaren, initierar instansvariabler och returnerar dessa.
    * @return Namn och handikapp
    */
   public String fakta() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("välkommen till golfprogrammet!");
      System.out.println("--------------------------------\n");
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

      return this.namn + this.handikapp;
   }
}

