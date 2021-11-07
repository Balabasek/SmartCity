public class Car {
    private String model;
    private int fuel = 0;
    private int maxFuel = 60;
    private boolean isRun = false;
    private Engine engine = new Engine();
    private Wheel wheel = new Wheel();

    public Car(String model) {
        this.model = model;
    }

    public void run(){
        if(fuel != 0) {
            engine.run();
            wheel.run();
        }else{
            System.out.println("Автомобиль не заправлен.");
        }
    }

    public void refuel(){
        System.out.println("Заправка началась.");
        try {
            while(fuel != maxFuel) {
                System.out.println(fuel + "/60");
                fuel += 10;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Автомобиль запрален");
    }

    public void changeWheel(){
        wheel.changeWheel();
    }

    public void printModel(){
        System.out.println(model);
    }

    private class Engine{
        public void run(){
            System.out.println("Попытка завести двигатель.");
            try {
                Thread.sleep(1000);
                System.out.println("Двигатель заведён.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Wheel{
        public void changeWheel(){
            System.out.println("Колесо заменено.");
        }
        public void run(){
            try {
                Thread.sleep(1000);
                System.out.println("Колёса начали движение.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.run();
        car.refuel();
        car.changeWheel();
        car.run();
    }
}
