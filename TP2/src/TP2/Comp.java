package TP2;

import java.util.Comparator;

/**
 * Created by olivier on 12/10/2015.
 */
public class Comp implements Comparator<Image>{

    public int compare(Image I1, Image I2) {
        if(I1.get_origin().getY() < I2.get_origin().getY()) return -1 ;
        if(I1.get_origin().getY() > I2.get_origin().getY()) return 1 ;
        return 0 ;
    }
}
