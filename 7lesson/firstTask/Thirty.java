import java.util.Arrays;

public class Thirty {
    public static void thirty(String value){
        String[] temp = value.split("\\s");
        Arrays.sort(temp);
        for (String word : temp) {
            System.out.println(word);
        }
    }
}
