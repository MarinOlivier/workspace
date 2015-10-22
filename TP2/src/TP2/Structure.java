package TP2;

/**
 * Created by olivier on 06/10/2015.
 */
abstract public class Structure implements Affichable, Compactable {
    public abstract void inserer(int elt);
    public abstract void supprimer(int elt);
    public abstract void afficher();
}
