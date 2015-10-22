package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo1 {
    public static void main(String[] args) {
        //------------- Test Point -------------
        Point a = new Point();
        System.out.println(a);

        Point b = new Point(1, 6);
        System.out.println(b);

        Point c;
        c = a.add(b);
        System.out.println(c);

    }
}
