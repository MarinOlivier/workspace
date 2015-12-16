package Exo4;

/**
 * Created by olivier on 03/11/2015.
 */
public class Article {
    private long code;
    private double prixHT;
    private int quantite;

    public double prixTTC() {
        return prixHT*1.196;
    }

    public void retirer(int x) {
        quantite = quantite-x;
    }

    public void ajouter(int x) {
        quantite = quantite + x;
    }
}
