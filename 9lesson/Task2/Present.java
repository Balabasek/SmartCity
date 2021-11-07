package Task2;

import Flowers.Flower;

import java.util.ArrayList;

public class Present {
    ArrayList<Sweet> sweets = new ArrayList<>();
    int totalWeight = 0;

    public void collectPresent(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
        for (Sweet s:sweets) {
            totalWeight += s.getWeight();
        }
        System.out.print("Общий вес подарка: ");
        System.out.println(totalWeight + "гр.");
    }

    public Sweet findToRange(int min, int max){
        for (Sweet s:sweets) {
            if(s.getCountSugar() >= min && s.getCountSugar() <= max){
                return s;
            }
        }
        return null;
    }

    public void sort(){
        for (int i = sweets.size() - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(sweets.get(j).getWeight() > sweets.get(j + 1).getWeight()) {
                    Sweet tmp = sweets.get(j);
                    sweets.set(j,sweets.get(j+1));
                    sweets.set(j+1, tmp);
                }
            }
        }
    }
}
