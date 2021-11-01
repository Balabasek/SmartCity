public class Ten {
    public static void ten(String value, int n){
        char[] temp = value.toLowerCase().toCharArray();
        int[] max = new int[n];
        int count = 0;
        char[] maxChar = new char[n];
        int tempk = 0;
        for (int i = 0; i < n; i++){
            maxChar[i] = Character.MIN_VALUE;
            max[i] = Integer.MIN_VALUE;
        }
        for(int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++){
                if(j == i){
                    count++;
                }
            }
            if(temp[i] > maxChar[n]) {
                for(int k = n; k >= 0; k--){
                    if(count > max[k]){
                        tempk = k;
                    }
                }
                for (int k = n; k > tempk; k--){
                    max[k] = max[k-1];
                    maxChar[k] = maxChar[k - 1];
                }
                max[tempk] = count;
                maxChar[tempk] = temp[i];
            }

            count = 0;
        }
        for (char c:maxChar) {
            System.out.println(c + "  ");
        }
        for (int i:max) {
            System.out.println(i + "  ");
        }
    }
}
