package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class PackRS extends CarDecorator {

    public PackRS(Car c){
        super._car = c;
    }

    public int getPrice(){
        return super._car.getPrice() + 2500;
    }

    public String getName(){
        return super._car.getName() + " + Pack RS";
    }
}
