package TP2;

/**
 * Created by olivier on 02/10/15.
 */
public class Point implements Cloneable {
    private int _x;
    private int _y;

    public Point() {
        _x = 0;
        _y = 0;
    }

    public Point(int x, int y) {
        _x = x;
        _y = y;
    }

    /**
     *
     * @return param x du point
     */
    public int getX() {
        return _x;
    }

    /**
     *
     * @param x abscisse du point
     */
    public void setX(int x) {
        _x = x;
    }

    /**
     *
     * @return param y du point
     */
    public int getY() {
        return _y;
    }

    /**
     *
     * @param y ordonnée du point
     */
    public void setY(int y) {
        _y = y;
    }

    /**
     * Addition de deux points
     * @param a
     * @return un nouveau point
     */
    public Point add(Point a) {
        Point temp = new Point();
        temp.setX(_x + a.getX());
        temp.setY(_y + a.getY());

        return temp;
    }

    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone() ;
    }

    public String toString() {
        return "(" + _x + " ; " + _y + ")";
    }

}
