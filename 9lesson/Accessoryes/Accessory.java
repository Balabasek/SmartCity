package Accessoryes;

import java.awt.*;

public class Accessory {
    private int price;
    private Color color;

    public Accessory(int price, Color color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }
}
