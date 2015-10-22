package TP2;

/**
 * Created by olivier on 12/10/2015.
 */
public class Main_Exo13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Liste n1") ;
        Liste Liste = new Liste() ;
        Liste.inserer(1);
        Liste.inserer(2);
        Liste.inserer(7);
        Liste.inserer(3);
        Liste.afficher();

        System.out.println("") ;
        System.out.println("Copie de la liste pr�c�dente") ;
        Liste Liste2 = Liste.clone() ;
        Liste2.afficher() ;


        System.out.println("") ;
        Point P = new Point(5,3) ;
        Point Q = new Point(6,2) ;
        Segment S = new Segment(P,Q) ;
        Piletransformations pile = new Piletransformations(10) ;
        pile.empiler(P) ;
        System.out.println("Segment n1") ;
        S.draw(pile);

        System.out.println("") ;
        System.out.println("Copie du pr�c�dent segment") ;
        Segment S2 = S.clone() ;
        S2.draw(pile);
    }
}
