package Firstfirst;

public class OrderedCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Ordered car");
    }

    @Override
    void buildType() {
        car.setTypeCar(TypeCar.ORDERED);
    }

    @Override
    void buildPrice() {
        car.setPrice(5000000);
    }
}
