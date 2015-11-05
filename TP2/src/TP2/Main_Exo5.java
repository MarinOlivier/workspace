package TP2;

import javax.annotation.Generated;

/**
 * Created by olivier on 09/10/2015.
 */

@Generated(value = "", date = "2015")
public class Main_Exo5 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Segment s1 = new Segment(p1, p2);
        Cercle cercle = new Cercle(p1, 2);
        Point point = new Point(5, 6);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("s1 = " + s1);
        System.out.println("cercle = " + cercle);
        System.out.println("point = " + point);

        Piletransformations pile = new Piletransformations(10);

        pile.empiler(point);
        System.out.println("pile courant = " + pile.get_courant());

        System.out.println("\n ----------- Dessin segment et cercle --------------");

        s1.draw(pile);
        cercle.draw(pile);

        System.out.println("\n ----------- Translation par point --------------");

        Point deplace = new Point(5, 5);
        System.out.println("Deplacement de " + deplace);

        s1.move(deplace);
        cercle.move(deplace);

        System.out.println("s1 = " + s1);
        System.out.println("cercle = " + cercle);


        System.out.println("\n ----------- Creation image --------------");

        Image img = new Image();
        img.insert(s1);
        img.insert(cercle);

        img.draw(pile);

        System.out.println("\n ----------- Deplacement image --------------");

        System.out.println("Deplacement de " + deplace);
        img.move(deplace);

        System.out.println("\n ----------- Affichage image --------------");

        img.draw(pile);

        System.out.println("\n ----------- Depilement point pile --------------");

        pile.depiler();
        System.out.println("pile courant = " + pile.get_courant());
    }
}
