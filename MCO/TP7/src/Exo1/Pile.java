package Exo1;

import java.util.Arrays;

/**
 * Created by olivier on 10/12/2015.
 */
public class Pile {

    public Commande CDeb;
    public Commande CFin;

    private int _size;
    private int _count;
    private int _tab[];

    /** Constructeur de la classe pile
     *
     * @param size Taille du tableau contenant les elements
     *
     */
    public Pile(int size) {
        _tab = new int [size];
        _size = size;
        _count = 0;
    }

    /**
     *
     * @return true si la pile est vide false si la pile est non vide
     */
    public boolean is_empty() {
        if (_count == 0)
            return true;
        else
            return false;
    }

    /**
     *
     * @return true si la pile est pleine false si la pile est non pleine
     */
    public boolean is_full() {
        if (_count == _size)
            return true;
        else
            return false;
    }

    /**
     *
     * @param elt l'element a ajouter au sommet de la pile
     */
    public void empiler(int elt) {
        CDeb.execute("empiler("+ elt +")");
        if(!this.is_full()) {
            _tab[_count] = elt;
            _count++;
        }
        CFin.execute("empiler("+ elt +")");
    }

    /**
     *
     * @return renvoie l'element au sommet de la pile
     */
    public int depiler() {
        CDeb.execute("depiler()");
        if (!this.is_empty()) {
            _count--;
            CFin.execute("depiler()");
            return _tab[_count];
        }
        else
            return -32555;

    }

    @Override
    public String toString() {
        return "Pile{" +
                "_size=" + _size +
                ", _count=" + _count +
                ", _tab=" + Arrays.toString(_tab) +
                '}';
    }

    public void getCFin() {
        System.out.println("CFin = " + CFin);
    }
}
