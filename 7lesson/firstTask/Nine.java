public class Nine {
    public static void nine(String value){
        String[] temp = value.split("\\s");
        int count;
        for (String t:temp) {
            count = 0;
            System.out.print("Слово" + t + "встречается ");
            for (String s :temp) {
                if(t.equals(s)){
                    count++;
                }
            }
            System.out.println(count + "раз");
        }
    }
}
