package hu.sebestyen;

public class mitirjon {
    public static String koszones(String nev, String nyelv){
        String eredmeny;
        if (nyelv.equals("hu"))
            eredmeny= "Szia "+ nev + "!";
        else if (nyelv.equals("en"))
            eredmeny= "Hello "+ nev + "!";
        else if (nyelv.equals("de"))
            eredmeny= "Gutten Tag "+ nev + "!";
        else eredmeny= "Ismeretlen nyelv!";


        return eredmeny;
    }
}
