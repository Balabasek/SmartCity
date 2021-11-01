public class TwentyOne {
    public static void twentyOne(String value){
        String[] temp = value.split("\\s");
        int summ = 0;
        for (String t:temp) {
            for (int i = 0; i < t.length(); i++) {
                if ((int) t.charAt(i) >= 48 || (int) t.charAt(i) <= 57){
                    summ += t.charAt(i);
                }
            }
        }
        System.out.println(summ);
    }
}
