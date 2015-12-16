package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class Mul extends Op_mul {

    public Mul(Facteur droite, Terme gauche){
        super(droite,gauche);
    }

    public double eval(){
        return super._droite.eval()*super._gauche.eval();
    }
}
