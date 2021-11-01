public class Nineteen {
    public static void nineteen(String value){
        String[] temp = value.split("\\s");
        String newString = new String();
        boolean isNeeded = true;
        for (String t:temp) {
            for (int i = 0; i < t.length(); i++){
                if(!((int)(t.charAt(i)) >= 65 && (int)(t.charAt(i)) <=90 || (int)(t.charAt(i)) >= 97 && (int)(t.charAt(i)) <=122)){
                    isNeeded = false;
                    break;
                }
            }
            if(isNeeded == true){
                newString = newString + " " + t.toUpperCase().charAt(0) + t.substring(1);
            }else{
                newString = newString + " " + t;
                isNeeded = true;
            }
        }
        value = newString;
    }
}
