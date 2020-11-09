import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Golf {

    //package private instansvariabler
    double meterkvar;
    int medellängd;
    int vind = 5;

    //privata instansvariabler
    private int fråga;
    private double Driver;
    private double Spoon;
    private double Järnfyra;
    private double Järnfemma;
    private double Järnsexa;
    private double Järnsjua;
    private double Järnåtta;
    private double Järnnia;
    private double Pitch;
    private double Sandwedge;

    /**
     * En instansmetod som beräknar hur långt man slår med de olika klubborna
     * @param medel längden på Järnsjuan
     * @return  klubbornas längd i form av en array
     */
    public double[] klubba(int medel) {

        double[] klubbor = new double[10];

        klubbor[0] = Driver = medellängd * 1.8;
        klubbor[1] = Spoon = medellängd * 1.5;
        klubbor[2] = Järnfyra = medellängd * 1.3;
        klubbor[3] = Järnfemma = medellängd * 1.15;
        klubbor[4] = Järnsexa = medellängd * 1.07;
        klubbor[5] = Järnsjua = medellängd;
        klubbor[6] = Järnåtta = medellängd * 0.95;
        klubbor[7] = Järnnia = medellängd * 0.85;
        klubbor[8] = Pitch = medellängd * 0.80;
        klubbor[9] = Sandwedge = medellängd * 0.7;


        return klubbor;
    }

    /**
     * En instansmetod som beräknar längden man slår * vinden
     * @param klubba är en kopia på arrayen klubba
     * @return klubbornas längd * vinden sparas i en array
     */
    public double[] vind(double[] klubba){


        double[] vind = klubba.clone();

        vind[0] = Driver * 0.9;
        vind[1] = Spoon * 0.9;
        vind[2] = Järnfyra * 0.9;
        vind[3] = Järnfemma * 0.9;
        vind[4] = Järnsexa * 0.9;
        vind[5] = Järnsjua * 0.9;
        vind[6] = Järnåtta * 0.9;
        vind[7] = Järnnia * 0.9;
        vind[8] = Pitch * 0.9;
        vind[9] = Sandwedge * 0.9;

        return vind;
    }

    /**
     * En instansmetod som räknar ut vilken klubba man bör använda
     * @param klubba är klubborna
     * @returnar vilken klubba man ska använda
     */
    public double längduträkning(double[] klubba) {


        if (meterkvar >= klubba[0])
            System.out.println("Du ska använda Driver");

        else if (meterkvar < klubba[0] && meterkvar >= klubba[1])
            System.out.println("du ska använda en Spoon");

        else if (meterkvar < klubba[1] && meterkvar >= klubba[2])
            System.out.println("du ska använda en Järnfyra");

        else if (meterkvar < klubba[2] && meterkvar >= klubba[3])
            System.out.println("du ska använda en Järnfemma");

        else if (meterkvar < klubba[3] && meterkvar >= klubba[4])
            System.out.println("du ska använda en Järnsexan");

        else if (meterkvar < klubba[4] && meterkvar >= klubba[5])
            System.out.println("du ska använda en Järnsjuan");

        else if (meterkvar < klubba[5] && meterkvar >= klubba[6])
            System.out.println("du ska använda en Järnåttan");

        else if (meterkvar < klubba[6] && meterkvar >= klubba[7])
            System.out.println("du ska använda en Järnnian");

        else if (meterkvar < klubba[7] && meterkvar >= klubba[8])
            System.out.println("du ska använda en Pitch");

        else
            System.out.println("du ska använda en Sandwedge");

        return meterkvar;
    }

    /**
     * En instansmetod som tar emot data från användaren och sätter värde på instansvariabeln och returnerar desssa
     * @return 1 eller 2
     */
    public String fråga(){
        Scanner scanner = new Scanner(System.in);

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
        return null;
    }
}
