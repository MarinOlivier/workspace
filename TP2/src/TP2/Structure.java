package TP2;

import javax.annotation.Generated;

/**
 * Created by olivier on 06/10/2015.
 */

@Generated(value = "", date = "2010")
abstract public class Structure implements Affichable, Compactable {
    public abstract void inserer(int elt);
    public abstract void supprimer(int elt);
    public abstract void afficher();
}
