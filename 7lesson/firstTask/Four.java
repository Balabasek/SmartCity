public class Four {
    public static String four(String value, String refactor, int k){
        value = value.substring(0, k) + refactor + value.substring(k);
        System.out.println(value);
        return value;
    }
}
