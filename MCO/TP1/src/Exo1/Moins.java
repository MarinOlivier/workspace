package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class Moins extends Op_add {
    public Moins(Facteur droite, Terme gauche){
        super(gauche,droite);
    }

    public double eval(){
        return super._gauche.eval()-super._droite.eval();
    }
}
