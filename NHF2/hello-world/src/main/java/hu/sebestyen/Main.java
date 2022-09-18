package hu.sebestyen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if(args.length==0)
            System.out.println("Hiba!");
        else if (args.length==1)
            System.out.println("Szia "+ args[0] + "!");
        else if (args[1].equals("hu"))
            System.out.println("Szia "+ args[0] + "!");
        else if (args[1].equals("en"))
            System.out.println("Hello "+ args[0] + "!");
        else if (args[1].equals("de"))
            System.out.println("Gutten Tag "+ args[0] + "!");
        else System.out.println("Ismeretlen nyelv!");

        }

}