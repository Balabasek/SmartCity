public class One {
    public static String one(String value, int k, char symbol){
        char[] letters = value.toCharArray();
        for(int i = k; i < letters.length; i+=k){
            letters[k] = symbol;
        }
        return new String(letters);
    }
}
