package hu.sebestyen;


public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hiba!");
        }
        else {
            if (args.length == 1) {
                System.out.println("Szia " + args[0] + "!");
            }
            else {
                System.out.println(mitirjon.koszones(args[0],args[1]));
            }
        }
    }

}