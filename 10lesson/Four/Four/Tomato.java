package Four;

public class Tomato extends Vegetables{
    public Tomato(int calories, int count) {
        super(calories, count);
    }

    @Override
    public String toString() {
        return "Помидор";
    }
}
