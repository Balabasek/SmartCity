public class TwentyFour {
    public static void twentyFour(String value){
        for (int i = 0; i < value.length() - 1; i++){
            if(value.charAt(i) == ' ' && value.charAt(i) == ' '){
                value = value.substring(0,i-1) + value.substring(i+1);
            }else if((((value.charAt(i) == '.') || (value.charAt(i)  == ',') || (value.charAt(i)  == '!') ||
                    (value.charAt(i)  == '?') || (value.charAt(i)  == ':') || (value.charAt(i)  == ';')) && value.charAt(i+1) == ' ')
                    && (value.charAt(i + 2) == '.') || (value.charAt(i + 2)  == ',') || (value.charAt(i + 2)  == '!') ||
                    (value.charAt(i + 2)  == '?') || (value.charAt(i + 2)  == ':') || (value.charAt(i +2)  == ';')){
                value = value.substring(0,i) + value.substring(i+2);
            }
        }
    }
}
