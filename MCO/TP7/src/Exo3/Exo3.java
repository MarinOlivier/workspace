package Exo3;

/**
 * Created by olivier on 10/12/2015.
 */
public class Exo3 {
    public static void main(String[] args) {
        Singleton sin = Singleton.getInstance();

        Singleton sin1 = Singleton.getInstance();

        System.out.println("sin = " + sin);
        System.out.println("sin1 = " + sin1);
    }
}
