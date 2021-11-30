package Firstfirst;

public class logic {
    public static void main(String[] args) {
        Seller seller = new Seller();

        seller.setBuilder(new SerialCarBuilder()); // При изменении Serial на Order - будет создан заказной автомобиль
        Car car = seller.buildCar();

        System.out.println(car);
    }
}
