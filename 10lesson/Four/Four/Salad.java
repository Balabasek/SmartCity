package Four;

import Five.Composition;

import java.util.ArrayList;

public class Salad {
    private final ArrayList<Vegetables> vegetables;

    public Salad(ArrayList<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    public void countCalories() {
        int totalCalories = 0;
        for (Vegetables v : vegetables) {
            totalCalories += v.getCalories() * v.getCount();
        }
        System.out.println("Общая ценность:");
        System.out.println(totalCalories + " калорий");
    }

    public void sortCalories(){
        for (int i = vegetables.size() - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(vegetables.get(j).getCalories() > vegetables.get(j + 1).getCalories()) {
                    Vegetables tmp = vegetables.get(j);
                    vegetables.set(j,vegetables.get(j+1));
                    vegetables.set(j+1, tmp);
                }
            }
        }
    }
    public void rangeOfCalories(int min, int max){
        for (Vegetables v : vegetables) {
            if(v.getCalories() > min && v.getCalories() < max){
                System.out.println("Овощ найден:");
                System.out.println(v + ". калории: " + v.getCalories());
                break;
            }
        }
    }
}