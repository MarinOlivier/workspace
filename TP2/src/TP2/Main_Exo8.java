package TP2;

import javax.annotation.Generated;

/**
 * Created by olivier on 09/10/2015.
 */
@Generated(value = "", date = "2010")
public class Main_Exo8 {
    public static void main(String[] args) {
        /*--------------------- Exo 8 ----------------------------------------*/
        Structure tab[] = new Structure[15];
        System.out.println("tab = " + tab);

        for (int i = 0; i < 15 ; i++) {
            if ((i%2) == 0) {
                Entiers e = new Entiers(2);
                e.inserer(1 + i);
                e.inserer(2 + i);
                tab[i] = e;
            }
            else {
                Liste l = new Liste();
                l.inserer(4+i);
                l.inserer(6+i);
                tab[i] = l;
            }
        }

        int i = 0;
        while (i < 15) {
            System.out.println("tab[" + i +"] = " + tab[i]);
            i++;
        }
    }
}
