package Exo4;

/**
 * Created by olivier on 03/11/2015.
 */
public class Main {
    public static void main(String[] args) {

        Generique<Article> g1 = new Generique<>(a1, a2);
        g1.fusionner(g2) // g2 est un Generique<Electromenager>

        /*
        * Non compatible car g1 est un générique Article alors que g2 est un générique Electromenager
        * Solution : introduction d'un type joker
        *   public Generique<A> fusionner(Generique<? extends Article> g)
        */



    }
}
