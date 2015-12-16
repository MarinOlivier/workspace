package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class Chiffre extends Facteur{
    protected double _c;

    public Chiffre(double x){
        _c = x;
    }

    public double eval() {
        return _c;
    }
}
