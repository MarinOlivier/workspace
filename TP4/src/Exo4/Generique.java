package Exo4;

/**
 * Created by olivier on 03/11/2015.
 */
public class Generique<A> {
    private A info1;
    private A info2;
    public Generique(A a, A b) {info1 = a; info2 = b;}

    public A getInfo1() {
        return info1;
    }

    public void setInfo1(A info1) {
        this.info1 = info1;
    }

    public A getInfo2() {
        return info2;
    }

    public void setInfo2(A info2) {
        this.info2 = info2;
    }

    public Generique<A> fusionner(Generique<A> g){
        return new Generique<>(getInfo1(), g.getInfo2());
    }
}
