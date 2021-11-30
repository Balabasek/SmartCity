package Firstfirst;

public class SerialCarBuilder extends CarBuilder {

    @Override
    void buildName() {
        car.setName("Serial car");
    }

    @Override
    void buildType() {
        car.setTypeCar(TypeCar.SERIAL);
    }

    @Override
    void buildPrice() {
        car.setPrice(100000);
    }
}
