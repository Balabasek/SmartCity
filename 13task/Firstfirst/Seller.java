package Firstfirst;

public class Seller {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildName();
        builder.buildType();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
