package Exo1;

import java.util.Arrays;

/**
 * Created by olivier on 13/10/2015.
 */
public class Pile {
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
        if(!this.is_full()) {
            _tab[_count] = elt;
            _count++;
        }
    }

    /**
     *
     * @return renvoie l'element au sommet de la pile
     */
    public int depiler() throws ExceptionForte {

        if (_count == 0) throw new PileVide();
        _count--;
        return _tab[_count];
    }

    @Override
    public String toString() {
        return "Pile{" +
                "_size=" + _size +
                ", _count=" + _count +
                ", _tab=" + Arrays.toString(_tab) +
                '}';
    }
}
