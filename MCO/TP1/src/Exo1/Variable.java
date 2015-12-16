package Exo1;

import java.util.TreeMap;

/**
 * Created by olivier on 02/12/2015.
 */
public class Variable extends Facteur{
    protected char _c;
    protected TreeMap<Character, Double> _treeMap;

    public Variable(char c, double x) {
        _c = c;
        _treeMap = new TreeMap();
        _treeMap.put(c, x);
    }

    public double eval(){
        return _treeMap.get(_c);
    }
}
