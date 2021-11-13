package Five;

import java.util.ArrayList;

public class logic {
    public static void main(String[] args) {
        ArrayList<Composition> compositions = new ArrayList<>();
        Song cadillac = new Song("Cadillac", "3:50", "Hip-Hop");
        Song rose = new Song("White Rose", "5:30", "Pop");
        Beat blackMage = new Beat("Black Mage", "2:00", "Alternative");
        Beat easyMoney = new Beat("Easy Money", "3:00", "Hip-Hop");
        compositions.add(cadillac);
        compositions.add(rose);
        compositions.add(blackMage);
        compositions.add(easyMoney);
        Disc disc = new Disc(compositions);
        disc.duration();
        disc.sortStyle();
        disc.findCompositionForTime("2:20", "3:30");
    }
}
