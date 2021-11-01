public class Twenty {
    public static void twenty(String value){
        String[] temp = value.split("\\s");
        int count = 0;
        for (String t: temp){
            for (int i = 0; i < t.length(); i++){
                if(t.charAt(i) == '.' || t.charAt(i) == ',' || t.charAt(i) == ';' ||
                        t.charAt(i) == '!' || t.charAt(i) == ':' || t.charAt(i) == '?' ||  t.charAt(i) == '-'){
                    count++;
                }else if(t.charAt(i) == '.'){
                    if(t.charAt(i+1) == '.'){
                        count++;
                        i = i+2;
                    }else {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
