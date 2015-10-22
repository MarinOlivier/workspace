package Exo4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by olivier on 16/10/2015.
 */
public class MonHashSet<E> extends HashSet<E>{

    public MonHashSet<E> randHashSet(int n) throws Exception{
        if (n >= this.size())
            throw new IndexOutOfBoundsException();

        MonHashSet<E> hs = new MonHashSet<>();

        Iterator<E> it = this.iterator();
        int i =0;
        while (i < n){
            hs.add(it.next());
            i++;
        }

        return hs;
    }
}
