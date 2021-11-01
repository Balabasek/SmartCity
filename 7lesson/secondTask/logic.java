import java.util.ArrayList;

public class logic {
    public static void main(String[] args) {
        String sentence = "Рука. Нога. Рука рука";
        ArrayList<Sentence> sentences = new ArrayList<>();
        String[] tempS = sentence.split("[.!?]\\s*");
        for (String t:tempS) {
            sentences.add(new Sentence(t));
        }
        //---------------------------1-------------------------
//        int count = 0;
//        for (Sentence s:sentences) {
//            if(s.isSame() == true){
//                count++;
//            }
//        }
//        System.out.println(count);
        //---------------------------2-------------------------
//        for (int i = 0; i < sentences.size() - 1; i++) {
//            for (int j = i + 1; j < sentences.size(); j++) {
//                if (sentences.get(i).getWords().size() > sentences.get(j).getWords().size()) {
//                    Sentence tmp = sentences.get(i);
//                    sentences.set(i, sentences.get(j));
//                    sentences.set(j,tmp);
//                }
//            }
//        }
        //---------------------------3-------------------------
//        boolean isFind = false;
//        for (Word w:sentences.get(0).getWords()) {
//            for (int i = 1; i < sentences.size(); i++){
//                if(w.equals(sentences.get(i))){
//                    isFind = true;
//                }
//            }
//            if(isFind = false){
//                System.out.println(w.getValue());
//                break;
//            }
//        }
//        //---------------------------4-------------------------
//        int length = 5;
//        boolean find = false;
//        ArrayList<Word> currentWords = new ArrayList<>();
//        for (Sentence s: sentences) {
//            if(s.getValue().matches("[\\w\\,\\s]*\\?\n")){
//                for (int i = 0 ; i < s.getWords().size(); i++){
//                    for (int j = 0; j < currentWords.size(); j++){
//                        if(s.getWords().get(i).equals( currentWords.get(j))){
//                            find = true;
//                        }
//                    }
//                    if(find == false){
//                        currentWords.add(s.getWords().get(i));
//                    }else{
//                        currentWords.remove(i);
//                    }
//                    find = false;
//                }
//            }
//        }
        //---------------------------5-------------------------
//        for (int i = 0; i < sentences.size(); i++){
//            Word tmp = sentences.get(i).getWords().get(0);
//            sentences.get(i).getWords().set(0,sentences.get(i).getWords().get(sentences.get(i).getWords().size() - 1));
//            sentences.get(i).getWords().set(sentences.get(i).getWords().size() - 1, tmp);
//        }
        //---------------------------6-------------------------
    }
}
