package Flowers;

import Accessoryes.Accessory;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Accessory> accessories = new ArrayList<>();
    private ArrayList<Flower> flowers = new ArrayList<>();
    private int totalPrice = 0;

    public void collectBouquet(ArrayList<Accessory> accessories, int totalPrice) {
        this.flowers = flowers;
        for (Flower f: flowers) {
            totalPrice = totalPrice + f.getPrice();
        }
        System.out.println("Стоимость букета: " +  totalPrice);
    }

    public void collectBouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories){
        this.flowers = flowers;
        this.accessories = accessories;
        for (Flower f: flowers) {
            totalPrice = totalPrice + f.getPrice();
        }
        for (Accessory a: accessories){
            totalPrice = totalPrice + a.getPrice();
        }
        System.out.println("Стоимость букета: " +  totalPrice);
    }

    public Flower randeLeng(int min, int max){
        for (Flower f: flowers) {
            if(f.getLen() >= min && f.getLen() <= max){
                return f;
            }
        }
        return null;
    }

    public void sort(){
        for (int i = flowers.size() - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(flowers.get(j).getFreshDate().after(flowers.get(j + 1).getFreshDate())) {
                    Flower tmp = flowers.get(j);
                    flowers.set(j,flowers.get(j+1));
                    flowers.set(j+1, tmp);
                }
            }
        }
    }
}
