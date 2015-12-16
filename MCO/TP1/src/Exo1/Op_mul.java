package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
abstract public class Op_mul extends Terme {
    Facteur _droite;
    Terme _gauche;

    public Op_mul(Facteur droite, Terme gauche) {
        _droite = droite;
        _gauche = gauche;
    }

    abstract public double eval();
}
