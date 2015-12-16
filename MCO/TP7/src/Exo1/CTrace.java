package Exo1;

/**
 * Created by olivier on 10/12/2015.
 */
public class CTrace implements Commande {
    @Override
    public void execute(String s) {
        System.out.println("CTrace : Commande name : " + s);
    }
}
