package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class IntCuir extends CarDecorator {

    public IntCuir(Car c){
        super._car = c;
    }

    public int getPrice() {
        return super._car.getPrice() + 600;
    }

    public String getName(){
        return super._car.getName() + " + Intérieur cuir";
    }
}
