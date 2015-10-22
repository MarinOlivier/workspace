package Exo2;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * Created by olivier on 13/10/2015.
 */
public class Pile<E> {
    private int _size;
    private int _count;
    private E _tab[];

    /** Constructeur de la classe pile
     *
     * @param size Taille du tableau contenant les elements
     *
     */
    public Pile(Class<?> c, int size) {
        _tab = (E[]) Array.newInstance(c, 10);
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
    public void empiler(E elt) {
        if(!this.is_full()) {
            _tab[_count] = elt;
            _count++;
        }
    }

    /**
     *
     * @return renvoie l'element au sommet de la pile
     */
    public E depiler(){

        if (_count == 0);
        _count--;
        return _tab[_count];
    }

    public void set_tabi(int i, E e){
        _tab[i] = e;
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
