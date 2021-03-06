package Exo3;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by olivier on 04/10/2015.
 */

@Date(2009)
public class Image extends Forme implements Affichable, Compactable, Comparable<Image>, Comparator<Image> {

    //private Point _p;
    private Forme _tab[];
    private int _size;
    private int _count;

    public Image() {
        _size = 10;
        _tab = new Forme[_size];
        _count = 0;
    }

    public Image (Point p) {
        set_origin(p);
        _size = 10;
        _tab = new Forme[_size];
        _count = 0;
    }

    public boolean is_full() {
        return _count >= _size;
    }

    public boolean is_empty() {
        return _count == 0;
    }

    public void insert(Forme f) {
        if (!this.is_full()) {
            _tab[_count] = f;
            _count++;
        }
    }

    public void draw(Piletransformations pile) {
        pile.empiler(get_origin());
        for (int i = 0 ; i < _count ; i++) {
            _tab[i].draw(pile);
        }
        pile.depiler();
    }

    /*public void move(Point point) {
        _p = _p.add(point);
    }*/

    public void move_child(Point p) {

    }

    public void afficher() {
        System.out.println("Image{" +
                "_p=" + get_origin() +
                ", _tab=" + Arrays.toString(_tab) +
                '}');
    }

    public void compacter(int elt) {
        this._count = this._count - elt;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p/>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p/>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p/>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p/>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p/>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Image o) {
        boolean b = this._count < o._count;
        if (b)
            return 0;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Image{" +
                "_p=" + get_origin() +
                ", _tab=" + Arrays.toString(_tab) +
                '}';
    }

    @Override
    public int compare(Image I1, Image I2) {
        if (I1.get_origin().getY() < I2.get_origin().getY()) return -1;
        if (I1.get_origin().getY() < I2.get_origin().getY()) return 1;
        return 0;
    }
}
