public class TwentySeven {
    public static void twentySeven(String value, String word){
        String[] temp = value.toLowerCase().split("\\s");
        String tempWord = null;
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'й' || word.charAt(i) == 'е' || word.charAt(i) == 'ё' || word.charAt(i) == 'е' || word.charAt(i) == 'и'){
                tempWord = tempWord + 'й';
            }else {
                tempWord = tempWord + word.charAt(i);
            }
        }
        for (String t: temp) {
            for(int i = 0; i < tempWord.length(); i++){
                if(t.charAt(i) == tempWord.charAt(i)){
                    tempCount++;
                }else if((t.charAt(i) == 'й' || t.charAt(i) == 'е' || t.charAt(i) == 'ё' || t.charAt(i) == 'е' || t.charAt(i) == 'и') && tempWord.charAt(i) == 'й'){
                    tempCount++;
                }
            }
            if(tempCount == tempWord.length()){
                count++;
            }
            tempCount = 0;
        }
        System.out.println(count);
    }
}
