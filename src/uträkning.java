public class uträkning {


    public static double[] vind(double[] klubba){


        double[] vind = klubba.clone();

        vind[0] = klubba[0] * 0.9;
        vind[1] = klubba[1] * 0.9;
        vind[2] = klubba[2] * 0.9;
        vind[3] = klubba[3] * 0.9;
        vind[4] = klubba[4] * 0.9;
        vind[5] = klubba[5] * 0.9;
        vind[6] = klubba[6] * 0.9;
        vind[7] = klubba[7] * 0.9;
        vind[8] = klubba[8] * 0.9;
        vind[9] = klubba[9] * 0.9;


        return vind;
    }


    public static double[] klubba(int längd) {

        double[] klubbor = new double[10];

        double Driver = längd * 1.8;
        double Spoon = längd * 1.5;
        double Järnfyra = längd * 1.3;
        double Järnfemma = längd * 1.15;
        double Järnsexa = längd * 1.07;
        double Järnsjua = längd;
        double Järnåtta = längd * 0.95;
        double Järnnia = längd * 0.85;
        double Pitch = längd * 0.80;
        double Sandwedge = längd * 0.7;

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


        if (meterkvar.längd >= klubba[0])
            System.out.println("Du ska använda Drivern");

        else if (meterkvar.längd < klubba[0] && meterkvar.längd >= klubba[1])
            System.out.println("du ska använda en Spoon");

        else if (meterkvar.längd < klubba[1] && meterkvar.längd >= klubba[2])
            System.out.println("du ska använda en Järnfyra");

        else if (meterkvar.längd < klubba[2] && meterkvar.längd >= klubba[3])
            System.out.println("du ska använda en Järnfemma");

        else if (meterkvar.längd < klubba[3] && meterkvar.längd >= klubba[4])
            System.out.println("du ska använda en Järnsexan");

        else if (meterkvar.längd < klubba[4] && meterkvar.längd >= klubba[5])
            System.out.println("du ska använda en Järnsjuan");

        else if (meterkvar.längd < klubba[5] && meterkvar.längd >= klubba[6])
            System.out.println("du ska använda en Järnåttan");

        else if (meterkvar.längd < klubba[6] && meterkvar.längd >= klubba[7])
            System.out.println("du ska använda en Järnnian");

        else if (meterkvar.längd < klubba[7] && meterkvar.längd >= klubba[8])
            System.out.println("du ska använda en Pitch");

        else
            System.out.println("du ska använda en Sandwedge");

        return meterkvar.längd;
    }
}