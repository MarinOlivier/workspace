package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class Div extends Op_mul {

    public Div(Facteur droite, Terme gauche){
        super(droite,gauche);
    }

    public double eval(){
        return super._gauche.eval()/super._droite.eval();
    }
}
