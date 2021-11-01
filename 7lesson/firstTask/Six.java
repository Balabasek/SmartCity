public class Six {
    public static String six(String value, int k, int key, char symbol){
        char temp;
        if(key == 1){
            for(int i = 0; i < value.length(); i++) {
                if (value.indexOf(i) == symbol){
                    value = value.substring(0,i) + value.substring(i+1);
                    value = value.substring(0,k) + symbol + value.substring(k);
                }

            }
        }else if(key == 0){
            for(int i = 0; i < value.length(); i++) {
                if (value.indexOf(i) == symbol){
                    value = value.substring(0,i) + value.substring(i+1);
                }
            }
        }
        return value;
    }
}
