package Exo2;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by olivier on 23/10/2015.
 */
public class Main {
    public static void main(String[] args) {

        final int SIZE = 1000;

        try {

            Integer obj = new Integer(1);

            Comparable<?> [] t = new Comparable<?> [SIZE];

            for (int i = 0 ; i < SIZE ; i++){
                Integer integer = i+1;
                Comparable<?> proxy = (Comparable<?>) Proxy.newProxyInstance(Comparable.class.getClassLoader(),
                        new Class<?>[]{Comparable.class}, new MyIH(integer));
                t[i] = proxy;
            }

            int pos = Arrays.binarySearch(t, obj);

            if (pos >= 0)
                System.out.println("Integer " + obj + " found at position : " + pos);
            else
                System.out.println("Integer " + obj + " not found.");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
