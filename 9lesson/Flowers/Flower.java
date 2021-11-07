package Flowers;

import java.util.Date;

public abstract class Flower {
    private int len;
    private Date freshDate;
    private int price;

    public Flower(int len, Date freshDate, int price) {
        this.len = len;
        this.freshDate = freshDate;
        this.price = price;
    }

    public Date getFreshDate() {
        return freshDate;
    }

    public void setFreshDate(Date freshDate) {
        this.freshDate = freshDate;
    }

    public int getPrice() {
        return price;
    }

    public int getLen() {
        return len;
    }
}
