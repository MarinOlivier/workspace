package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo11 {
    public static void main(String[] args) {
        /* Cr�ation d'un point P */
        Point P = new Point(5,3);

		 /* Cr�ation d'un point Q pour la suite */
        Point Q = new Point(6,2);

		 /* Cr�ation d'un point P1 pour la suite */
        Point P1 = new Point(1,8);

		 /* Cr�ation d'un point Q1 pour la suite */
        Point Q1 = new Point(4,9);

		/* Cr�ation d'un Segment S */
        Segment S = new Segment(P,Q);

		/* Cr�ation d'un Segment S2 */
        Segment S2 = new Segment(P1,Q1);

		/* Cr�ation d'un Cercle C */
        Cercle C = new Cercle(P, 5);

		/* Cr�ation d'un Cercle C2 */
        Cercle C2 = new Cercle(Q,2) ;

		/* Cr�atoin d'une pile de transformation pile */
        Piletransformations pile = new Piletransformations(10) ;

        /* Empilement du point P dans la pile de transformation */
        pile.empiler(P) ;

        Image tab[] = new Image[3];

		/* Cr�ation de l'image I */
        Image I = new Image () ;


		
		/* Ajout dans I */
        I.insert(S) ;
        I.insert(C) ;
        I.insert(S2) ;
        I.insert(C2) ;

		/* Dessin de l'image I */
        System.out.println("Dessin de l'image I") ;
        I.draw(pile) ;

        /* Cr�ation de l'image I1 */
        Image I1 = new Image () ;


		/* Ajout dans I1 */
        I1.insert(S) ;
        I1.insert(C) ;

		/* Dessin de l'image I1 */
        System.out.println("Dessin de l'image I1") ;
        I1.draw(pile) ;

        /* Cr�ation de l'image I2 */
        Image I2 = new Image () ;

		/* Ajout dans I2 */
        I2.insert(S) ;
        I2.insert(C) ;
        I2.insert(C2) ;

		/* Dessin de l'image I */
        System.out.println("Dessin de l'image I2") ;
        I2.draw(pile) ;

        tab[0] = I;
        tab[1] = I1;
        tab[2] = I2;

        System.out.println("Avant Sort");

        for (int i = 0; i < tab.length; i++)
            tab[i].afficher();

        // Tri
        boolean sorted = false;
        int size = tab.length;
        while (!sorted){
            sorted = true;
            for (int i = 0 ; i < size-1; i++){
                if (tab[i].compareTo(tab[i+1]) == 1){
                    Image tmp;
                    tmp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = tmp;
                    sorted = false;
                }
            }
            size--;
        }

        System.out.println("Apres sort");

        for (int i = 0; i < tab.length; i++)
            tab[i].afficher();


    }
}
