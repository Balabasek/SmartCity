import Accessoryes.Accessory;
import Accessoryes.Ribbon;
import Accessoryes.Strawberry;
import Flowers.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class logic {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        Date date = calendar.getTime();
        Rose rose = new Rose(10,date,50);
        calendar = new GregorianCalendar(2021,11,7);
        date = calendar.getTime();
        Tulip tulip = new Tulip(12,date,60);
        calendar = new GregorianCalendar(2021,11,6);
        date = calendar.getTime();
        Chrysanthemum chrysanthemum = new Chrysanthemum(13,date,70);
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(rose);
        flowers.add(tulip);
        flowers.add(chrysanthemum);
        Ribbon ribbon = new Ribbon(20, Color.RED);
        Strawberry strawberry = new Strawberry(30,Color.RED);
        ArrayList<Accessory> accessories = new ArrayList<>();
        accessories.add(ribbon);
        accessories.add(strawberry);
        Bouquet bouquet = new Bouquet();
        bouquet.collectBouquet(flowers,accessories);
        bouquet.randeLeng(11,13);
        bouquet.sort();
    }
}
