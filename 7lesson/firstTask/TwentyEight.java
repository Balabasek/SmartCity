public class TwentyEight {
    public static void twentyEight(String value){
        String[] temp = value.toLowerCase().split("[.!?]\\s*");
        String tempString = null;
        for (String t: temp) {
            tempString = tempString + t.toUpperCase().charAt(0);
            for(int i = 1; i < t.length(); i++){
                tempString = tempString + t.charAt(i);
            }
        }
        value = tempString;
    }
}
