package Exo1;

/**
 * Created by olivier on 13/10/2015.
 */
public class ExceptionForte extends Exception {
    String _msg = "ExceptionForte -> ";

    @Override
    public String toString() {
        return _msg;
    }
}

class PileVide extends ExceptionForte {
    String _msg = "Pile Vide";

    @Override
    public String toString() {
        return super.toString() + _msg;
    }
}

class HorsLimites extends ExceptionForte {
    int _size, _index;

    public HorsLimites(int size, int index) {
        _size = size;
        _index = index;
    }

    @Override
    public String toString() {
        return super.toString() + "Out of Bound : Range [0 ; " + (_size-1) + "]. Wanted index : " + _index;
    }
}