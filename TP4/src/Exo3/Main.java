package Exo3;

import javax.annotation.Generated;
import java.io.File;

/**
 * Created by olivier on 23/10/2015.
 */
@Date(2010)
public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("/Users/olivier/Documents/Polytech/Cours 4a Moi/workspace/TP4/src/Exo3");
            String[] s = f.list();

            int i = 0;
            while (i < s.length){
                s[i] = s[i].split("\\.")[0];
                Class<?> c = Class.forName("Exo3."+s[i]);
                System.out.println("c = " + c);

                if (c.isAnnotationPresent(Date.class)){
                    if (c.getAnnotation(Date.class).value() < 2009){
                        System.out.println("Inf a 2009");
                    }
                    else if (c.getAnnotation(Date.class).value() >= 2009){
                        System.out.println("Sup ou eq à 2009");
                    }
                }
                else
                    System.out.println("Pas d'annotation Date");

                i++;

            }

        } catch (Exception e) {
            System.out.println("e = " + e);
        }

    }
}
