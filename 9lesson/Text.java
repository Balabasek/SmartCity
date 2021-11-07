import java.util.ArrayList;
import java.util.Objects;

public class Text {
    private ArrayList<Sentence> arrayList = new ArrayList<>();
    private String head = null;

    public void supple(String string){
        String sentences[] = string.split("(?<=[.!?:])\\s");
        for (String s:sentences) {
            this.arrayList.add(new Sentence(s));
        }
    }

    public void write(){
        String tmp = new String();
        for (Sentence a:arrayList) {
            tmp = tmp + a.toString() + " ";
        }
        if(head != null) {
            System.out.println("\u001B[31m" + head + "\u001B[0m");
        }
        System.out.println(tmp);
    }

    public void setHead(String head){
        this.head = head;
    }


    public static void main(String[] args) {
        Text text = new Text();
        text.supple("Hello, People!");
        text.supple("KekLol.");
        text.supple("YA mnogo em. Ne znayu pochemy.");
        text.setHead("Победа СССР");
        text.write();
    }
}

class Sentence{
    private ArrayList<Word> arrayList = new ArrayList<>();

    public ArrayList<Word> getArrayList() {
        return arrayList;
    }

    protected Sentence(String string) {
        String[] tmp = string.split("\\s");
        for (String t:tmp) {
            arrayList.add(new Word(t));
        }
    }

    @Override
    public boolean equals(Object o) {

        String txt = new String();
        String txt2 = new String();
        for (int i = 0; i < this.arrayList.size(); i++){
            txt = txt + this.arrayList.get(i).getWord() + " ";
        }
        for (int i = 0; i < ((Sentence)o).arrayList.size(); i++){
            txt2 = txt2 + ((Sentence)o).arrayList.get(i).getWord() + " ";
        }
        if(txt.equals(txt2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayList);
    }

    @Override
    public String toString() {
        String txt = new String();
        for (int i = 0 ; i < this.arrayList.size() - 1; i++) {
            txt = txt + arrayList.get(i).toString() + " ";
        }
        txt = txt + this.arrayList.get(this.arrayList.size() - 1).toString();
        return txt;
    }
}

class Word{
    private String word;

    protected Word(String word) {
        this.word = word;
    }

    protected String getWord() {
        return word;
    }

    protected void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        return this.word.equals(((Word) o).word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return word;
    }
}
