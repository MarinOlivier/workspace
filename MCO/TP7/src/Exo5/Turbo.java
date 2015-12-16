package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class Turbo extends CarDecorator {

    public Turbo(Car c){
        super._car = c;
    }

    public int getPrice(){
        return super._car.getPrice() + 1000;
    }

    public String getName(){
        return super._car.getName() + " + Turbo";
    }
}
