package Four;

import java.util.ArrayList;

public class logic {
    public static void main(String[] args) {
        ArrayList<Vegetables> vegetables = new ArrayList<>();
        Vegetables tomato = new Tomato(30,4);
        Vegetables cucumber = new Cucumber(25,2);
        vegetables.add(tomato);
        vegetables.add(cucumber);
        Salad salad = new Salad(vegetables);
        salad.countCalories();
        salad.sortCalories();
        salad.rangeOfCalories(24,31);
    }
}
