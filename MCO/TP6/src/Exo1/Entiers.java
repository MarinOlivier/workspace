package Exo1;

import java.util.Arrays;

/**
 * Created by olivier on 04/12/2015.
 */
public class Entiers implements MonIterable{
    private int _tab[];
    private int _size;
    private int _count;

    public class EntIterator implements BidirIterator, SupIterator {

        private int _courant=0;

        EntIterator(Entiers e){
            _courant = 0;
        }

        @Override
        public int courant() {
            return _tab[_courant];
        }

        @Override
        public void suivant() throws ArrayIndexOutOfBoundsException {
            if (!fin())
                _courant++;
            else
                throw new ArrayIndexOutOfBoundsException();
        }

        @Override
        public boolean fin() {
            return _courant == _count;
        }

        @Override
        public void precedent() throws ArrayIndexOutOfBoundsException {
            if (!(_courant == 0))
                _courant--;
            else
                throw new ArrayIndexOutOfBoundsException();
        }

        @Override
        public void supprime() {
            if (_courant == _count-1)
                _count--;
            else {
                for (int i = _courant; i < _count; i++) {
                    _tab[_courant] = _tab[_courant + 1];
                }
                _count--;
            }
        }
    }

    public Entiers(int size) {
        _tab = new int [size];
        _size = size;
        _count = 0;
    }

    @Override
    public MonIterator createIterator() {
        return (MonIterator) new EntIterator(this);
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
    public void inserer(int elt) {
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

    /**
     *
     * @param elt : Element a supprimer a l'entier
     */
    public void supprimer(int elt) {
        for(int i = 0 ; i < _count ; i++){
            if(_tab[i] == elt) {
                for(int j = i ; j < _count-1 ; j++)
                    _tab[j] = _tab[++j];
                _count--;
            }
        }
    }

    /**
     *  Affichage de l'objet
     */
    public void afficher() {
        if(_count == 0)
            System.out.println("Tableau vide");
        else {
            System.out.println("Entiers{" +
                    "_tab=" + Arrays.toString(_tab) +
                    ", _count=" + _count +
                    '}');
        }
    }

    public void compacter(int elt) {
        this._count = this._count - elt;
    }

    @Override
    public String toString() {
        return "Entiers{" +
                "_tab=" + Arrays.toString(_tab) +
                ", _count=" + _count +
                '}';
    }
}
