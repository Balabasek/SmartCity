public class Seven {
    public static String seven(String value){
        char[] temp = value.toCharArray();
        String newValue = new String();
        for(char c : temp){
            if(!Character.isLetter(c)){
                System.out.print(c + " ");
                newValue = newValue + c;
            }
        }
        value = newValue;
        return value;
    }
}
