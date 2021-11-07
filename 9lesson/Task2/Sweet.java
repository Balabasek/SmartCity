package Task2;

public abstract class Sweet {
    private int weight;
    private int countSugar;

    public Sweet(int weight, int countSugar) {
        this.weight = weight;
        this.countSugar = countSugar;
    }

    public int getWeight() {
        return weight;
    }

    public int getCountSugar() {
        return countSugar;
    }
}
