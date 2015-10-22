package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo6 {
    public static void main(String[] args) {
        // --------------------------- Test 3 ---------------------------
        System.out.println("\n ----------- 2 segments --------------");
        Point a1 = new Point();
        Point b1 = new Point(2, 4);

        Segment s1 = new Segment(a1, b1);
        System.out.println("s1 = " + s1);

        Point a2 = new Point(1, 3);
        Point b2 = new Point(5, 7);

        Segment s2 = new Segment(a2, b2);
        System.out.println("s2 = " + s2);

        System.out.println("\n ----------- 2 cercles --------------");
        Point z1 = new Point(9, 8);
        Cercle c1 = new Cercle(z1, 15);
        System.out.println("c1 = " + c1);

        Point z2 = new Point(20, 5);
        Cercle c2 = new Cercle(z2, 34);
        System.out.println("c2 = " + c2);

        System.out.println("\n ----------- 1 point --------------");
        Point p1 = new Point(60, 53);
        System.out.println("p1 = " + p1);

        System.out.println("\n ----------- 3 images --------------");
        Image img1 = new Image();
        System.out.println("img1 = " + img1);

        Image img2 = new Image();
        System.out.println("img2 = " + img2);

        Image img3 = new Image();
        System.out.println("img3 = " + img3);

        System.out.println("\n ----------- Pile transformation --------------");
        Piletransformations pile = new Piletransformations(10);
        System.out.println("pile = " + pile);

        System.out.println("\n ----------- empiler p1 --------------");
        pile.empiler(p1);
        System.out.println("pile = " + pile);

        System.out.println("\n ----------- ajout des formes aux images --------------");
        img1.insert(s1);
        img1.insert(c1);
        System.out.println("img1 = " + img1);

        img2.insert(s2);
        img2.insert(c2);
        System.out.println("img2 = " + img2);

        System.out.println("\n ----------- Affichage images --------------");
        System.out.println("\n    ---- img1 ----");
        img1.draw(pile);
        System.out.println("\n    ---- img2 ----");
        img2.draw(pile);

        System.out.println("\n ----------- Deplacement images --------------");
        Point deplace = new Point(5, 5);
        System.out.println("deplace = " + deplace);
        img1.move(deplace);
        System.out.println("img1 = " + img1);

        System.out.println("\n ----------- Des images dans une image --------------");
        img3.insert(img1);
        img3.insert(img2);
        System.out.println("img3 = " + img3);
        img3.draw(pile);

        System.out.println("\n ----------- Depilement point --------------");
        pile.depiler();
        System.out.println("pile = " + pile);
    }
}
