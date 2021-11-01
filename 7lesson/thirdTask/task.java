import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdThree {
    public static void main(String[] args) {
        //--------------------------------------------2------------------------------------------------//
        String value = null;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            value = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int max = 0;
        String maxValue = null;
        int cur;
        if(value != null) {
            for (int i = 0; i < value.length(); i++) {
                for (int j = 0; j < value.length(); j++) {
                  if (j > i && value.charAt(i) == value.charAt(j)) {
                        cur = value.substring(i, j + 1).length();
                        if (cur > max) {
                            max = cur;
                            maxValue = value.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        if(maxValue != null) {
            value = value.replace(maxValue, "");
        }
        System.out.println(value);

        //--------------------------------------------4----------------------------------
        Matcher m = Pattern.compile("(.)\\1+").matcher(value);
        while (m.find()){
            String sub = m.group();
            value = value.replace(sub, sub.charAt(0) + String.valueOf(sub.length()));
        }
        System.out.println(value);
    }
}
