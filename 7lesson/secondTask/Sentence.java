import java.util.ArrayList;

public class Sentence {
    private String value;
    private ArrayList<Word> words = new ArrayList<>();
    private boolean same;

    public Sentence(String value) {
        this.value = value;
        String[] temp = value.split("\\s");
        for (String t:temp) {
            words.add(new Word(t));
        }
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++){
                if(i != j && words.get(i).getValue().equals(words.get(j).getValue())){
                    same = true;
                }
            }
        }
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public boolean isSame() {
        return same;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
