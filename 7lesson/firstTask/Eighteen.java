public class Eighteen {
    public static void eighteen(String value){
        String[] temp = value.toLowerCase().split("\\s");
        int[] counts = new int[21];
        for (String t: temp) {
            for (int i = 0; i < t.length(); i ++){
                for(int j = 0; j < 21; j++){
                    if(t.charAt(i) != 'a' || t.charAt(i) != 'i' ||
                            t.charAt(i) != 'u' || t.charAt(i) != 'e' || t.charAt(i) != 'o'){
                        counts[(int)t.charAt(i) - 'a']++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < 21; i++) {
            if(counts[i] <= 2){
                System.out.println((char) (i + 'a'));
            }
        }
    }
}
