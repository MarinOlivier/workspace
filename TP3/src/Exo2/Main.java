package Exo2;

import java.util.ArrayDeque;

/**
 * Created by olivier on 13/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        Pile<String> p = new Pile<>(String.class, 4);
        
        p.empiler("Hello");
        p.empiler("World");

        System.out.println("p = " + p);

        p.set_tabi(3, "abc");
        System.out.println("p = " + p);

        ArrayDeque<String> arr = new ArrayDeque<>(6);
        arr.add("Abc");
        arr.add("DEF");
        System.out.println("arr = " + arr);
    }
}
