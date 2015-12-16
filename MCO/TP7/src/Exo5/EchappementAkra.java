package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class EchappementAkra extends CarDecorator{

    public EchappementAkra(Car c){
        super._car = c;
    }

    public int getPrice() {
        return super._car.getPrice() + 3000;
    }

    public String getName(){
        return super._car.getName() + " + Echappement akrapovic";
    }
}
