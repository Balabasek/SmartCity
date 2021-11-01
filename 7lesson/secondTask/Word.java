import java.awt.*;
import java.util.ArrayList;

public class Word {
    private String value; 
    private int length;
    private char firstSymbol;

    public Word(String value){
        this.value = value;
        this.length = value.length();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


}
