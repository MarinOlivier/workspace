package TP2;

/**
 * Created by olivier on 09/10/2015.
 */
public class Main_Exo10 {
    public static void main(String[] args) {
        Compactable T[] = new Compactable[3] ;

        Entiers e = new Entiers(10) ;
        e.inserer(11) ;
        e.inserer(12) ;
        e.inserer(13) ;
        e.inserer(14) ;
        T[0] = e ;

        Liste l = new Liste() ;
        l.inserer(1) ;
        l.inserer(2) ;
        l.inserer(3) ;
        l.inserer(4) ;
        T[1] = l ;


		/* Création d'un point P */
        Point P = new Point(5,3);
		 /* Création d'un point Q pour la suite */
        Point Q = new Point(6,2);
		/* Création d'un Segment S */
        Segment S = new Segment(P,Q) ;
		/* Création d'un Cercle C */
        Cercle C = new Cercle(Q,5) ;
		/* Créatoin d'une pile de transformation pile */
        Piletransformations pile = new Piletransformations(10) ;
		/* Empilement du point P dans la pile de transformation */
        pile.empiler(P) ;
		/* Création de l'image I */
        Image I = new Image () ;
		/* Ajoute de S et de C dans I */
        I.insert(S); ;
        I.insert(C); ;
        T[2] = I ;

        for (int i = 0 ; i < T.length ; i++) {
            T[i].compacter(2) ;
        }

        e.afficher() ;
        l.afficher() ;
        I.afficher() ;
    }
}
