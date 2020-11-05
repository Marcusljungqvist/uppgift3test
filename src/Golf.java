public class Golf {

    static int meterkvar;
    static int medellängd;
    static int vind = 5;

    private static double Driver;
    private static double Spoon;
    private static double Järnfyra;
    private static double Järnfemma;
    private static double Järnsexa;
    private static double Järnsjua;
    private static double Järnåtta;
    private static double Järnnia;
    private static double Pitch;
    private static double Sandwedge;


    public static double[] vind(double[] klubba){


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


    public static double[] klubba(int längd) {

        double[] klubbor = new double[10];

        Driver = längd * 1.8;
        Spoon = längd * 1.5;
        Järnfyra = längd * 1.3;
        Järnfemma = längd * 1.15;
        Järnsexa = längd * 1.07;
        Järnsjua = längd;
        Järnåtta = längd * 0.95;
        Järnnia = längd * 0.85;
        Pitch = längd * 0.80;
        Sandwedge = längd * 0.7;

        klubbor[0] = Driver;
        klubbor[1] = Spoon;
        klubbor[2] = Järnfyra;
        klubbor[3] = Järnfemma;
        klubbor[4] = Järnsexa;
        klubbor[5] = Järnsjua;
        klubbor[6] = Järnåtta;
        klubbor[7] = Järnnia;
        klubbor[8] = Pitch;
        klubbor[9] = Sandwedge;

        return klubbor;
    }

    public static double längduträkning(double[] klubba) {


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
}
