package TP2;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by olivier on 12/10/2015.
 */
public class Main_Exo12 {
    public static void main(String[] args) {
        Comp c1 = new Comp() ;
        LinkedList<Image> ll = new LinkedList<Image>() ;

        Point P = new Point(5,3);
        Point Q = new Point(6,2);
        Point P1 = new Point(1,8);
        Point Q1 = new Point(4,9);
        Segment S = new Segment(P,Q) ;
        Segment S2 = new Segment(P1,Q1) ;
        Cercle C = new Cercle(P,5) ;
        Cercle C2 = new Cercle(Q,2) ;
        Piletransformations pile = new Piletransformations(10) ;
        pile.empiler(P) ;
        Image I1 = new Image () ;
        Image I2 = new Image () ;
        I1.set_origin(P);
        I1.insert(S) ;
        I1.insert(C) ;
        I2.set_origin(P1);
        I2.insert(S2) ;
        I2.insert(C2) ;

        ll.add(I1) ;
        ll.add(I2) ;

        Image i = Collections.max(ll,c1) ;

        i.afficher() ;
    }
}
