package Five;

public class Composition {
    private String name;
    private String time;
    private String genre;

    public Composition(String name, String time, String genre) {
        this.name = name;
        this.time = time;
        this.genre = genre;
    }

    public String getTime() {
        return time;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
