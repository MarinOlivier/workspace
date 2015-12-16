package Exo1;

/**
 * Created by olivier on 04/12/2015.
 */
public class Main {
    public static void main(String[] args) {
        Entiers integer = new Entiers(10);
        integer.inserer(1);
        integer.inserer(2);
        integer.inserer(3);
        integer.inserer(4);
        integer.inserer(5);

        Listes list = new Listes();
        list.inserer(1);
        list.inserer(2);
        list.inserer(3);
        list.inserer(4);
        list.inserer(5);
        list.inserer(7);

        System.out.println("---------- Entiers ----------");

        MonIterator entIter = integer.createIterator();

        while (!entIter.fin()){
            System.out.println(entIter.courant());
            try {
                entIter.suivant();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("e = " + e);
            }
        }

        System.out.println("---------- Liste ----------");

        MonIterator listIter = list.createIterator();
        while (!listIter.fin()){
            System.out.println(listIter.courant());
            try {
                listIter.suivant();
            }
            catch (NullPointerException e){
                System.out.println("e = " + e);
            }
        }

        // Manque de temps pour les autres tests.
    }
}
