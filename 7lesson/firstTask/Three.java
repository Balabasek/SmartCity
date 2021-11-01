public class Three {
    public static String three(String value){
        char[] letters = value.toCharArray();
        for (int i = 0; i < letters.length - 1; i++){
            if(letters[i] == 'Р' && letters[i+1] == 'А'){
                letters[i+1] = 'О';
            }
        }
        return new String(letters);
    }
}
