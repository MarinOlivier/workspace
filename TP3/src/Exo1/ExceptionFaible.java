package Exo1;

/**
 * Created by olivier on 13/10/2015.
 */
public class ExceptionFaible extends Exception {
    String _msg = "Exception Faible -> ";

    @Override
    public String toString() {
        return _msg;
    }
}


class NotElementEntiers extends ExceptionFaible {
    int _i;

    public NotElementEntiers(int i) {_i = i;}

    @Override
    public String toString() {
        return super.toString() + "Entiers : \"" + _i + "\" : Element not found.";
    }
}

class NotElementListe extends ExceptionFaible {
    String _msg = "Element (Liste) not found";

    @Override
    public String toString() {
        return super.toString() + _msg;
    }

}
