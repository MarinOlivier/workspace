package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class Audio extends CarDecorator {

    public Audio(Car c){
        super._car = c;
    }

    public int getPrice() {
        return super._car.getPrice() + 750;
    }

    public String getName(){
        return super._car.getName() + " + Audio Bose";
    }
}
