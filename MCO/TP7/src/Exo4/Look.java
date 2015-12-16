package Exo4;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by olivier on 10/12/2015.
 */
public class Look implements Observer {
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
        Point p = (Point) o;
        System.out.println("Update");
    }
}
