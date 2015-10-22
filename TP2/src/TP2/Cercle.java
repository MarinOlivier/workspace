package TP2;

/**
 * Created by olivier on 02/10/15.
 */
public class Cercle extends Forme implements Affichable {

    //private Point _a;
    private int _r;

    public Cercle(Point a, int r) {
        set_origin(a);
        _r = r;
    }

    /**
     * Applique la transformation courante
     * @param p Pile de transformation
     */
    public void draw(Piletransformations p) {
        System.out.println("\n ---- Cercle ----");
        //System.out.println("    Descripteur NON translatés : [ " + _a + ", " + _r + " ]");
        //System.out.println("    Transformation courante : " + p.get_courant());

        System.out.println("    Descripteur translatés : [ " + get_origin().add(p.get_courant()) + ", " + _r + " ]");
    }

    /**
     * Deplace un Segment par une translation P
     * @param p Point de translation
     */
    /*public void move(Point p) {
        set_origin(get_origin().add(p));
    }*/

    public void move_child(Point p) {
        /* Do nothing */
    }

    public void afficher() {
        System.out.println("[ " + get_origin() + ", " + _r + " ]");
    }

    public String toString() {
        return "[ " + get_origin() + ", " + _r + " ]";
    }
}
