public class Eight {
    public static void eight(String value){
        char symbol = '/';
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(i) == symbol) {
                    if(j != i && value.charAt(j) == symbol){
                        value = value.substring(0,i) + value.substring(j+1);
                        break;
                    }
                }
            }
        }
        System.out.println(value);
    }
}
