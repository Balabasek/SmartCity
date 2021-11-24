import java.util.concurrent.Semaphore;

public class Ship extends Thread{
    private int capacity = 5;
    private int currentCount;
    private Port currentPort;
    private Semaphore semaphore;

    public Ship(String name, int capacity, Semaphore sem) {
        super(name);
        this.capacity = capacity;
        this.currentCount = 0;
        this.semaphore = sem;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    @Override
    public void run() {
        try {
            while (Port.getCount() != 0) {
                if(currentCount == 0) {
                    semaphore.acquire();
                    System.out.println(getName() + " Заехал в порт.");
                    if (Port.getCount() >= 2) {
                        System.out.println(getName() + " Загружает груз.");
                        sleep(500);
                        currentCount = capacity;
                        Port.setCount(Port.getCount() - capacity);
                        System.out.println(getName() + " Загрузился и освобождает пирс.");
                        semaphore.release();
                    } else if (Port.getCount() == 1) {
                        System.out.println(getName() + " Загружает груз.");
                        sleep(500);
                        currentCount = capacity;
                        Port.setCount(Port.getCount() + capacity);
                        System.out.println(getName() + " Загрузился и освобождает пирс.");
                        semaphore.release();
                    } else {
                        System.out.println(getName() + " Заметил, что порт разгружен и уезжает обратно");
                        interrupt();
                        semaphore.release();
                    }
                }else {
                    semaphore.acquire();
                    System.out.println(getName() + " Заехал в другой порт.");
                        System.out.println(getName() + " Выгружает груз.");
                        sleep(500);
                        currentCount = 0;
                        semaphore.release();
                    }
                }
            } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

