package Exo2;

import java.util.ArrayList;

/**
 * Created by olivier on 10/12/2015.
 */
public class Exo2 {
    public static void main(String[] args) {
        PileArr<String> pile = new PileArr<String>();

        pile.push("Hello");
        pile.push(" the ");
        pile.push("wordl !!!");

        System.out.println("pile = " + pile);

        System.out.println((String)pile.peek());

        System.out.println((String)pile.pop());

        System.out.println("pile = " + pile);
    }
}
