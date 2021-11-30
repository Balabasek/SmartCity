package SecondSecond;

public class logic {
    public static void main(String[] args) {
        PostalOffice postalOffice = new PostalOffice();

        postalOffice.addLetter("Моргенштерн уехал из страны!!!");
        postalOffice.addLetter("Оксимирон скоро выпустит альбом!!!");

        Subscriber first = new Subscriber("Саня");
        Subscriber second = new Subscriber("Вовка");

        postalOffice.addObserver(first);
        postalOffice.addObserver(second);

        postalOffice.addLetter("ОКСИМИРОН МОЖЕТ НЕ ВЫПУСТИТЬ АЛЬБОМ!!!");

        postalOffice.removeLetter("Оксимирон скоро выпустит альбом!!!");
    }
}
