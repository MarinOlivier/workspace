package Exo1;

import java.util.Stack;

/**
 * Created by olivier on 10/12/2015.
 */
public class CPile implements Commande {

    protected Stack<String> _stack;
    private int _current;

    public CPile(){
        _stack = new Stack<String>();
        _current = 0;
    }

    @Override
    public void execute(String s) {
        _stack.push(s);
        _current++;
    }



    @Override
    public String toString() {
        return "CPile{" +
                "_stack=" + _stack +
                ", _current=" + _current +
                '}';
    }
}
