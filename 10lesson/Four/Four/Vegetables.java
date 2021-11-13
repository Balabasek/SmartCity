package Four;

public abstract class Vegetables {
    private int calories;
    private int count;

    public Vegetables(int calories, int count) {
        this.calories = calories;
        this.count = count;
    }

    public int getCalories() {
        return calories;
    }

    public int getCount() {
        return count;
    }
}
