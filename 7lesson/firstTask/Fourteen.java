public class Fourteen {
    public static void fourteen(String value){
        String[] temp = value.split("\\s");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String t: temp) {
            if(t.length() > max){
                max = t.length();
            }else if(t.length() < min){
                min = t.length();
            }
        }
        System.out.println("Слова минимальной длины");
        for (String t:temp) {
            if(t.length() == min){
                System.out.println(t);
            }
        }
        System.out.println("Слова максимальной длины");
        for (String t:temp) {
            if(t.length() == max){
                System.out.println(t);
            }
        }
    }
}
