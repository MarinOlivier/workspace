package Exo3;

/**
 * Created by olivier on 10/12/2015.
 */
public class Singleton {
    static Singleton _instance = null;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}
