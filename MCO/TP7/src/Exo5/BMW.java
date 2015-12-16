package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public class BMW extends Car {

    public BMW(){
        _name = "BMW";
        _price = 30000;
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
