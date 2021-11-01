public class TwentyNine {
    public static void twentyNine(String value){
        String[] temp = value.split("\\s");
        for (String t:temp) {
            t.replaceAll("([A-Za-z])\\1+", t);
        }
        value = temp.toString();
    }
}
