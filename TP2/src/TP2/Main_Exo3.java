package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo3 {
    public static void main(String[] args) {
        //------------- Test Piletransformation sur cercle -------------
        Point a = new Point();
        System.out.println(a);

        Point b = new Point(1, 6);
        System.out.println(b);

        Point c;
        c = a.add(b);
        System.out.println(c);

        Piletransformations p2 = new Piletransformations(10);
        Cercle cercle = new Cercle(a, 5);
        System.out.println("\n" + cercle);

        cercle.draw(p2);

        p2.empiler(c);

        cercle.draw(p2);

        p2.depiler();

        cercle.draw(p2);
    }
}
