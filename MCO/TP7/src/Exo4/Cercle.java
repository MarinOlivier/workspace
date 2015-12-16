package Exo4;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by olivier on 16/12/2015.
 */
public class Cercle implements Observer{
    Point _org;
    int _r;

    public Cercle(Point org, int r){
        _org = org;
        _r = r;
    }

    public Point get_org() {
        return _org;
    }

    public void set_org(Point _org) {
        this._org = _org;
    }

    public int get_r() {
        return _r;
    }

    public void set_r(int _r) {
        this._r = _r;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "_org=" + _org +
                ", _r=" + _r +
                '}';
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        _org = (Point)o;
        System.out.println("Update");
    }
}
