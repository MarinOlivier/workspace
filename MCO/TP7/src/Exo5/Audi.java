package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class Audi extends Car {

    public Audi(){
        _name = "Audi";
        _price = 50000;
    }

    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public String getName() {
        return _name;
    }
}
