import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Port extends Thread{
    private static volatile int count = 20;
    private static int piers = 2;

    public static int getPiers() {
        return piers;
    }

    private final Queue<Ship> ships = new LinkedList<>();

    public Port(Queue<Ship> ships) {
        this.ships.addAll(ships);
    }

    public static int getCount() {
        return count;
    }

    public Queue<Ship> getShips() {
        return ships;
    }

    public static void setCount(int count) {
        Port.count = count;
    }

    @Override
    public void run() {
            for (Ship s:ships) {
                s.start();
            }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(Port.piers, true);
        Ship ship = new Ship("Первый", 5, semaphore);
        Ship ship1 = new Ship("Второй", 5, semaphore);
        Ship ship2 = new Ship("Третий", 5, semaphore);
        Queue<Ship> ships = new LinkedList<>();
        ships.add(ship);
        ships.add(ship1);
        ships.add(ship2);
        Port port = new Port(ships);
        port.start();
    }
}
