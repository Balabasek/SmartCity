public class Eleven {
    public static void eleven(String value){
        String[] temp = value.toLowerCase().split("[.!?]\\s*");
        char z;
        int counta;
        int countb;
        for (String str: temp) {
            counta = 0;
            countb = 0;
            for(int i = 0; i < str.length(); i++){
                z = str.charAt(i);
                if (z!='a' || z!='e' || z!='i' || z!='o' || z!='u') {
                    countb++;
                }else if(z != ' '){
                    counta++;
                }
            }
            if(counta > countb){
                System.out.println("В предложении" + str + "больше гласных");
            }else if(countb > counta){
                System.out.println("В предложении" + str + "больше согласных");
            }
        }
    }
}
