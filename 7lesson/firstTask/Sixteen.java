public class Sixteen {
    public static void sixteen(String value){
        String[] temp = value.toLowerCase().split("\\s");
        int[] counts = new int[temp[0].length()];
        char[] symbols = new char[temp[0].length()];
        for (int i = 0; i < temp[0].length(); i++) {
            symbols[i] = temp[0].charAt(i);
            counts[i] = 0;
        }

        for (int i = 1; i < temp.length; i++){
            for(int j = 0; j < temp[i].length(); j++){
                for (int k = 0; j < temp[0].length(); k++){
                    if(temp[i].charAt(j) == symbols[k]){
                        counts[k]++;
                    }
                }
            }
        }
        for (int i = 0; i < symbols.length; i++){
            if(counts[i] == temp.length){
                System.out.println(symbols[i]);
            }
        }
    }
}
