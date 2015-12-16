package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class Exo5 {
    public static void main(String[] args) {
        Car audi = new Audi();
        System.out.println(audi.getName() + " " + audi.getPrice());

        Turbo audi1 = new Turbo(audi);
        System.out.println(audi1.getName() + " " + audi1.getPrice());

        PackRS audi2 = new PackRS(audi1);
        System.out.println(audi2.getName() + " " + audi2.getPrice());

        JanteAlu audi3 = new JanteAlu(audi2);
        System.out.println(audi3.getName() + " " + audi3.getPrice());

        IntCuir audi4 = new IntCuir(audi3);
        System.out.println(audi4.getName() + " " + audi4.getPrice());

        EchappementAkra audi5 = new EchappementAkra(audi4);
        System.out.println(audi5.getName() + " " + audi5.getPrice());


        //--------- BMW

        System.out.println();

        Car bmw = new BMW();
        System.out.println(bmw.getName() + " " + bmw.getPrice());

        EchappementAkra bmw1 = new EchappementAkra(bmw);
        System.out.println(bmw1.getName() + " " + bmw1.getPrice());
    }
}
