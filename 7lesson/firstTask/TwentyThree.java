public class TwentyThree {
    public static void TwentyThree(String value){
        String[] temp = value.split("\\s");
        int[] counts = new int[temp.length/2 + 1];
        for (int i = 0; i < temp.length; i++) {
            for (String t: temp) {
                if(temp[i].equals(t)){
                    counts[i]++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] < 2){
                System.out.println(temp[i]);
            }
        }
    }
}
