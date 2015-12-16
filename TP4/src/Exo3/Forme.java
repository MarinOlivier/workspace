package Exo3;

import javax.annotation.Generated;

/**
 * Created by olivier on 04/10/2015.
 */
@Date(2014)
abstract public class Forme implements Affichable, Cloneable {

    private Point _origin;

    public Forme() {
        _origin = new Point(0,0);
    }

    public Forme(Point origin) {
        _origin = origin;
    }

    public Point get_origin() {
        return _origin;
    }

    public void set_origin(Point a) {
        _origin = a;
    }

    public void move(Point p) {
        _origin = _origin.add(p);
        move_child(p);
    }

    public abstract void draw(Piletransformations p);
    //public abstract void move(Point p);
    public abstract void move_child(Point p);

}
