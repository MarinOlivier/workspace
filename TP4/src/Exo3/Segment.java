package Exo3;

import javax.annotation.Generated;

/**
 * Created by olivier on 02/10/15.
 */

@Date(2000)
public class Segment extends Forme implements Affichable, Cloneable {
    //private Point _a;
    private Point _b;

    public Segment(Point a, Point b) {
    //    _a = a;
        set_origin(a);
        _b = b;
    }

    /**
     * Applique la transformation courante
     * @param p : pile de transformation
     */
    public void draw(Piletransformations p) {
        System.out.println("\n ---- Segment ----");
        //System.out.println("    Descripteur NON translatés : [ " + _a + " " + _b + " ]");
        //System.out.println("    Transformation courante : " + p.get_courant());

        System.out.println("    Descripteur translatés : [ " + get_origin().add(p.get_courant()) + ", " + _b.add(p.get_courant()) + " ]");
    }

    /**
     * Deplace un Segment par une translation P
     * @param p un point servant pour la translation
     */
    /*public void move(Point p) {
        set_origin(get_origin().add(p));
        _b = _b.add(p);
    }*/

    public Segment clone() throws CloneNotSupportedException {
        Segment res = (Segment) super.clone() ;
        res.set_origin(get_origin().clone());
        return res ;
    }

    public void move_child(Point p) {
        _b = _b.add(p);
    }

    public void afficher() {
        System.out.println("[ " + get_origin() + " " + _b + " ]");
    }

    public String toString() {
        return "[ " + get_origin() + " " + _b + " ]";
    }
}
