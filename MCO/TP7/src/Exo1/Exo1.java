package Exo1;

public class Exo1 {

    public static void main(String[] args) {
        Pile pile = new Pile(30);

        pile.CDeb = new CTrace();
        pile.CFin = new CPile();

        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.empiler(4);
        pile.empiler(5);
        pile.empiler(6);
        pile.empiler(7);

        pile.depiler();

        System.out.println("pile = " + pile);
        pile.getCFin();
    }
}
