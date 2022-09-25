package hu.sebestyen;

public class mitirjon {
    public static void koszones(String nev, String nyelv){
        if (nyelv.equals("hu"))
            System.out.println("Szia "+ nev + "!");
        else if (nyelv.equals("en"))
            System.out.println("Hello "+ nev + "!");
        else if (nyelv.equals("de"))
            System.out.println("Gutten Tag "+ nev + "!");
        else System.out.println("Ismeretlen nyelv!");


    }
}
