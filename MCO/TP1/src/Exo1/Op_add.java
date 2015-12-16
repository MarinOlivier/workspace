package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
abstract public class Op_add extends Expression {
    Terme _gauche;
    Expression _droite;

    public Op_add(Terme gauche, Expression droite){
        _gauche = gauche;
        _droite= droite;
    }

    abstract public double eval();
}
