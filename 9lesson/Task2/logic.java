package Task2;

import java.util.ArrayList;

public class logic {
    public static void main(String[] args) {
        Sweet toffee = new Toffee(5,20);
        Sweet marmalade = new Marmalade(7,15);
        ArrayList<Sweet> sweets = new ArrayList<>();
        sweets.add(toffee);
        sweets.add(marmalade);
        Present present = new Present();
        present.collectPresent(sweets);
        present.findToRange(21,21);
        present.sort();
    }
}
