package Firstfirst;

public abstract class CarBuilder {
    Car car;

    void createCar(){
        this.car = new Car();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
