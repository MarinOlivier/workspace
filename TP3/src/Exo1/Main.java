package Exo1;

/**
 * Created by olivier on 13/10/2015.
 */
public class Main {
    public static void main(String[] args) {

        Pile p = new Pile(4);
        Entiers e = new Entiers(6);
        Liste l = new Liste();


        //p.empiler(2);

        try {
            //-------------- Test Exception faible NotElementEntier -------------
            /*
            e.add(2);
            e.add(3);
            System.out.println("e = " + e);
            e.remove(5); // <-- change value
            */

            //-------------- Test Exception faible NotElementListe -------------
            /*
            l.inserer(1);
            l.inserer(2);
            System.out.println("l = " + l);
            l.supprimer(5); // <-- create exception
            */

            //-------------- Test Exception Forte PileVide -------------
            /*
            p.empiler(1);
            p.empiler(4);
            System.out.println("p = " + p);
            p.depiler();
            p.depiler();
            p.depiler(); // <-- Create exception
            */

            //-------------- Test Exception Forte HorsLimites -------------
            //e.element(10); // <-- Create exception

            //-------------- Code sans exception, mais pouvant en lever
            p.empiler(1);
            p.depiler();
            e.add(2);
            e.remove(2);
            //l.supprimer(4);
        }
        catch (ExceptionForte forte) {
            System.out.println(forte);
        }
        catch (ExceptionFaible faible) {
            System.out.println(faible);
        }
    }
}
