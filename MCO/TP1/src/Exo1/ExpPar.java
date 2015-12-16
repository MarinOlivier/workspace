package Exo1;

/**
 * Created by olivier on 02/12/2015.
 */
public class ExpPar extends Facteur  {

    protected Expression _exp;

    public ExpPar(Expression expression) {
        _exp = expression;
    }

    public double eval(){
        return _exp.eval();
    }
}
