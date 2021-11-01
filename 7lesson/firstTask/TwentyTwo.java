public class TwentyTwo {
    public static void twentyTwo(String value){
        value.replaceAll("\\/\\*([\\S\\s]+?)\\*\\/", null);
        value.replaceAll("(?s)/\\*.*?\\*/", null);
    }
}
