package Firstfirst;

public class Car {
    private String name;
    private TypeCar typeCar;
    private int price;


    public void setName(String num) {
        this.name = num;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "num='" + name + '\'' +
                ", typeCar=" + typeCar +
                ", price=" + price +
                '}';
    }
}
