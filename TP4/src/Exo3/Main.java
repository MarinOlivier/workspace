package Exo3;

import java.io.File;

/**
 * Created by olivier on 23/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("/Users/olivier/Documents/Polytech/Cours 4a Moi/workspace/TP2/src/TP2");
            String[] s = f.list();

            int i = 0;
            while (s != null){
                System.out.println("s[i] = " + s[i]);
                i++;
            }

            System.out.println("s = " + s);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }

    }
}
