public class ThirtyOne {
    public static void thirty(String value){
        String[] temp = value.split("\\s");
        int count = 0;
        for (String s:temp) {
            if((int)s.charAt(0) >= 97 && (int)s.charAt(0) <= 122){
                count++;
            }
        }
        System.out.println(count);
    }
}
