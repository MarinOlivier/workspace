package Exo5;

/**
 * Created by olivier on 16/12/2015.
 */
public abstract class CarDecorator extends Car {
    Car _car;

    public abstract int getPrice();

    public abstract String getName();
}
