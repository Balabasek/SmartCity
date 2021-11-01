public class Twelve {
    public static void twelve(String value){
        String[] temp = value.toLowerCase().split("\\s");
        char z;
        char x;
        int count = 0;
        for (String str: temp) {
                z = str.charAt(0);
                x = str.charAt(str.length() - 1);
                if (z=='a' || z=='e' || z=='i' || z=='o' || z=='u' || x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
                    count++;
                }
        }
        System.out.println(count);
    }
}
