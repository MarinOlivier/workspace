package Exo4;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by olivier on 10/12/2015.
 */
public class Exo4  {

    public static void main(String[] args) {

        Point org = new Point(4,6);

        Cercle c = new Cercle(new Point(4,6), 7);
        org.addObserver(c);

        System.out.println("c = " + c);

        org.setX(32);

        System.out.println("c = " + c);

    }
}
