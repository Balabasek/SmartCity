package SecondSecond;

import java.util.ArrayList;
import java.util.List;

public class PostalOffice implements Observed{
    List<String> letters = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addLetter(String letter){
        this.letters.add(letter);
        notifyObservers();
    }

    public void removeLetter(String letter){
        this.letters.remove(letter);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:subscribers) {
            o.handleEvent(this.letters);
        }
    }

}
