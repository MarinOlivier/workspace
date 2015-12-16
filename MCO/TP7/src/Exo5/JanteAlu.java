package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class JanteAlu extends CarDecorator {

    public JanteAlu(Car c){
        super._car = c;
    }

    public int getPrice(){
        return super._car.getPrice() + 700;
    }

    public String getName(){
        return super._car.getName() + " + Jantes Alu";
    }
}
