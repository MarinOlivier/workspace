package Exo5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by olivier on 20/10/2015.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------- ArrayList --------------------");
        final int SIZE = 1000000;
        ArrayList<Integer> arr_int = new ArrayList<>(1000000);

        for (int i = 0; i < SIZE; i++) {
            arr_int.add(i, 42);
        }

        final int N = 100000;
        long b_add, e_add;
        long sum_average = 0;

        for (int i = 0 ; i < N ; i++){
            b_add = System.currentTimeMillis();
            arr_int.add(SIZE/2, 1);
            e_add = System.currentTimeMillis();
            sum_average += (e_add-b_add);
        }

        float average = (float)sum_average/(float)N;

        System.out.println("average = " + average + " ms/elt");

        System.out.println("-------------------- LinkedList --------------------");

        sum_average = 0;
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            ll.add(i, 42);
        }

        ListIterator<Integer> listIterator = ll.listIterator(SIZE/2);

        for (int i = 0; i < N; i++) {
            b_add = System.currentTimeMillis();
            listIterator.add(1);
            e_add = System.currentTimeMillis();
            sum_average += (e_add-b_add);
        }

        average = (float)sum_average/(float)N;

        System.out.println("average = " + average + " ms/elt");
    }
}
