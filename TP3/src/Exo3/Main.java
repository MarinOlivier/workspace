package Exo3;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by olivier on 16/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();

        File f = new File("/Users/olivier/Documents/Polytech/Cours 4a Moi/workspace/TP3/src/Exo3/test.txt");
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String str = sc.next();
                Integer val = (Integer) t.get(str);
                if (val == null)
                    t.put(str, 1);
                else
                    t.put(str, val+1);

            }
            sc.close();
        }
        catch (IOException e){
            System.out.println("Fail");
        }

        System.out.println("t = " + t);

        String sortKey = "milieu";

        NavigableMap sub;
        sub = t.headMap(sortKey, true);

        NavigableMap high;
        high = t.tailMap(sortKey, false);

        System.out.println("sub = " + sub);
        System.out.println("high = " + high);

        NavigableSet nav = t.navigableKeySet();
        Iterator nav_it = nav.iterator();

        TreeMap t_range = new TreeMap();
        Integer bot = 3;
        Integer top = 5;
        while (nav_it.hasNext()) {
            String str = (String) nav_it.next();
            Integer val = (Integer) t.get(str);
            if (val >= bot && val <= top ){
                t_range.put(str, val);
            }
        }

        System.out.println("t_range = " + t_range);
    }
}
