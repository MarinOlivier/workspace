package Exo4;

import java.util.HashSet;

/**
 * Created by olivier on 16/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 6);
        Point p2 = new Point(8, 14);
        Point p3 = new Point(5, 16);
        Point p4 = new Point(3, 6);

        int hash = p1.hashCode();
        boolean eq = p1.equals(p2);
        boolean eq_bis = p1.equals(p1);

        System.out.println("hash = " + hash);
        System.out.println("eq = " + eq);
        System.out.println("eq_bis = " + eq_bis);

        HashSet<Point> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);

        hs.add(p4); // pas d'ajout car déja présent

        System.out.println("hs = " + hs);

        MonHashSet<Point> Mhs = new MonHashSet<>();
        Mhs.add(p1);
        Mhs.add(p2);
        Mhs.add(p3);

        MonHashSet<Point> newMhs = new MonHashSet<>();

        try {
            newMhs = Mhs.randHashSet(2);
            System.out.println("newMhs = " + newMhs);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
