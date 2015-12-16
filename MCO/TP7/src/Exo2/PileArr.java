package Exo2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by olivier on 10/12/2015.
 */
public class PileArr<A> implements PileInterface {

    ArrayList<A> _arr;
    int _current;

    public PileArr(){
        _arr = new ArrayList<>();
        _current = -1;
    }

    @Override
    public void push(Object E) {
        _arr.add((A)E);
        _current++;
    }

    @Override
    public Object peek() {
        if (_current >=0)
            return _arr.get(_current);
        else
            return null;
    }

    @Override
    public Object pop() {
        if(_current >= 0) {
            _current--;
            return _arr.remove(_current+1);
        }
        else
            return null;
    }

    @Override
    public String toString() {
        return "PileArr{" +
                "_arr=" + _arr +
                ", _current=" + _current +
                '}';
    }
}
