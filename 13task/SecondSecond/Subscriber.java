package SecondSecond;

import java.util.List;

public class Subscriber implements Observer{
    String name;


    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> letters) {
        System.out.println(name + ", Вам пришли печатные издания:" + letters + "\n");
    }

}
