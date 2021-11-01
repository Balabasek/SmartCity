public class Five {
    public static String five(String value, String subString,String word){
            StringBuffer stringBuffer = new StringBuffer(value);
            int i=0, pos1=0;
            while ((pos1 = stringBuffer.indexOf(subString, i)) != -1) {
                pos1 += 3;
                stringBuffer.insert(pos1, word);
                i = pos1;
            }
            value = new String(stringBuffer);
            return value;
    }
}
