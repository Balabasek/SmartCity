public class ThirtyTwo {
    public static void thirtyOne(String value, String word){
        String[] temp = value.toLowerCase().split("\\s");
        int count = 0;
        for (String t:temp) {
            if(t.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
