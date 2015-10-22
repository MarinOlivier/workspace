package TP2;

import java.util.Arrays;
/**
 * Created by olivier on 02/10/15.
 */
public class Piletransformations {

    private Point _t[];
    private int _size;
    private int _courant; //indice du somment de pile

    public Piletransformations(int size) {
        _t = new Point [size];
        _t[0] = new Point(0, 0);
        _size = size;
        _courant = 0;
    }

    /**
     *
     * @return Rend la transformation courante
     */
    public Point get_courant() {
        return _t[_courant];
    }

    /**
     *
     * @return TRUE si la pile est plein, FALSE sinon
     */
    public boolean is_full() {
        return _size-1 == _courant;
    }

    /**
     *
     * @return TRUE si la pile est vide, FALSE sinon
     */
    public boolean is_empty() {
        return _courant == 0;
    }

    /**
     * Empile une nouvelle transformation, en l'additionnant a la précédente
     * @param a Point de transformation
     */
    public void empiler(Point a) {
        if(!this.is_full()) {
            _t[_courant + 1] = _t[_courant].add(a);
            _courant++;
        }
    }

    /**
     * Depile une tranformation
     */
    public void depiler() {
        if(!this.is_empty()) {
          _courant--;
        }
    }

    @Override
    public String toString() {
        return "Piletransformations{" +
                "_t=" + Arrays.toString(_t) +
                ", _courant=" + _courant +
                '}';
    }
}
