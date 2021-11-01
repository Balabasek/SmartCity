public class Seventeen {
    public static void seventeen(String value){
        final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
        String[] temp = value.toLowerCase().split(ALPHABET);
        int max = Integer.MIN_VALUE;
        String current = null;
        for (String t:temp) {
            if(t.length() > max){
                max = t.length();
                current = t;
            }
        }
        System.out.println(current);
    }
}
