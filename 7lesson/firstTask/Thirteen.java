public class Thirteen {
    public static void thirteen(String value){
        String[] temp = value.split("\\s");
        for (String t:temp) {
            if(!(t.charAt(0) == t.charAt(t.length()-1))){
                System.out.print(t + " ");
            }
        }
    }
}
