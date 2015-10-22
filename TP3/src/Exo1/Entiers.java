package Exo1;

import java.util.Arrays;

/**
 * Created by olivier on 13/10/2015.
 */
public class Entiers {
    private int _tab[];
    private int _size;
    private int _count;

    public Entiers(int size) {
        _tab = new int [size];
        _size = size;
        _count = 0;
    }

    /**
     *
     * @return true si le tablea est vide false si le tableau est non vide
     */
    public boolean is_empty() {
        return _count == 0;
    }

    /**
     *
     * @return true si le tableau est pleine false si le tableau est non pleine
     */
    public boolean is_full() {
        return _count == _size;
    }

    /**
     *
     * @param elt : Element a ajouter a l'Entier
     */
    public void add(int elt) {
        if(this.is_empty()) {
            _tab[0] = elt;
            _count++;
        }
        else if(!this.is_full()) {
            boolean exist = false;
            int i = 0;
            while(i < _count && exist == false){
                exist = _tab[i] == elt;
                i++;
            }

            if(!exist) {

                for(i = 0 ; i < _count ; i++) {
                    if(elt < _tab[i]) {
                        for(int j = _count ; j >= i ; j--)
                            _tab[j] = _tab[j-1];
                        _tab[i] = elt;
                        _count++;
                        exist = true;
                    }

                }
                if(!exist){
                    _tab[_count] = elt;
                    _count++;
                }
            }
        }
    }

    public int element(int i) throws ExceptionForte
    {
        if (i < 0 || i >= _size) throw new HorsLimites(_size, i);
        return _tab[i];
    }

    /**
     *
     * @param elt : Element a supprimer a l'entier
     */
    public void remove(int elt) throws ExceptionFaible {
        boolean found = false;
        for(int i = 0 ; i < _count ; i++){
            if(_tab[i] == elt) {
                found = true;
                for(int j = i ; j < _count-1 ; j++)
                    _tab[j] = _tab[++j];
                _count--;
            }
        }
        if (!found) throw new NotElementEntiers(elt);
    }

    /**
     *  Affichage de l'objet
     */
    public void afficher() {
        if(_count == 0)
            System.out.println("Tableau vide");
        else {
            for(int i = 0 ; i < _count ; i++)
                System.out.print(" " + _tab[i] + " ");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Entiers{" +
                "_tab=" + Arrays.toString(_tab) +
                ", _size=" + _size +
                ", _count=" + _count +
                '}';
    }
}
