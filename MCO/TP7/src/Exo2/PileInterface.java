package Exo2;

import java.util.ArrayList;

/**
 * Created by olivier on 10/12/2015.
 */
public interface PileInterface<A> {
    void push(A E);
    A peek();
    A pop();
}
