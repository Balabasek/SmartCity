package Five;

import java.util.ArrayList;

public class Disc {
    private final ArrayList<Composition> compositions;

    public Disc(ArrayList<Composition> compositions) {
        this.compositions = compositions;
    }

    public void duration(){
        int totalTime = 0;
        int index;
        for (Composition c : compositions) {
            index = c.getTime().indexOf(":");
            totalTime += Integer.parseInt(c.getTime().substring(0,index)) * 60 + Integer.parseInt(c.getTime().substring(index+1));
        }
        System.out.println("Продолжительность композиций на диске:");
        System.out.println(totalTime / 60 + ":" + totalTime % 60);
    }

    public void sortStyle(){
            for (int i = compositions.size() - 1; i > 0; i--){
                for (int j = 0; j < i; j++){
                    if(compositions.get(j).getGenre().compareTo(compositions.get(j + 1).getGenre()) > 0) {
                        Composition tmp = compositions.get(j);
                        compositions.set(j,compositions.get(j+1));
                        compositions.set(j+1, tmp);
                    }
                }
            }
    }

    public void findCompositionForTime(String min, String max){
        int totalTime;
        int index;
        index = min.indexOf(":");
        int minTime = Integer.parseInt(min.substring(0,index)) * 60 + Integer.parseInt(min.substring(index+1));
        index = max.indexOf(":");
        int maxTime = Integer.parseInt(max.substring(0,index)) * 60 + Integer.parseInt(max.substring(index+1));
        for (Composition c:compositions) {
            index = c.getTime().indexOf(":");
            totalTime = Integer.parseInt(c.getTime().substring(0,index)) * 60 + Integer.parseInt(c.getTime().substring(index+1));
            if(totalTime >= minTime && totalTime <= maxTime){
                System.out.println("Композиция найдена: ");
                System.out.println(c.getName());
                break;
            }
        }
    }


}
