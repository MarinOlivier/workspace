package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class Plus extends Op_add {
    public Plus(Facteur droite, Terme gauche){
        super(gauche,droite);
    }

    public double eval(){
        return super._droite.eval()+super._gauche.eval();
    }
}
