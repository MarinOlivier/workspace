package TP2;

import javax.annotation.Generated;

/**
 * Created by olivier on 09/10/2015.
 */
@Generated(value = "", date = "2012")
public class Main_Exo2 {
    public static void main(String[] args) {
        //------------- Test Piletransformation sur Segment -------------
        Point a = new Point();
        System.out.println(a);

        Point b = new Point(1, 6);
        System.out.println(b);

        Point c;
        c = a.add(b);
        System.out.println(c);

        Piletransformations p = new Piletransformations(10);
        Segment s = new Segment(a, b);
        System.out.println(s);

        s.draw(p);

        p.empiler(c);

        s.draw(p);

        p.depiler();

        s.draw(p);
    }
}
