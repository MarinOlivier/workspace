package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo9 {
    public static void main(String[] args) {

        Affichable affichable[] = new Affichable[5] ;
        affichable[0] = new Entiers(10) ;
        affichable[1] = new Liste() ;
        affichable[2] = new Cercle(new Point(3,6), 5) ;
        affichable[3] = new Segment(new Point(2,2), new Point(3,3)) ;
        affichable[4] = new Image() ;

        for (int i = 0 ; i < affichable.length ; i++) {
            affichable[i].afficher() ;
        }

    }
}
