public class Fifteen {
    public static void fifteen(String value){
        String[] temp = value.split("\\s");
        int total = 0;
        try {
            int price = Integer.parseInt(temp[0]);
            for (String t:temp) {
                total+=price;
            }
            System.out.println("Квитанция на оплату слов. С вас" + total + "рублей");
        } catch (NumberFormatException e) {
            System.out.println("Цена не задана");
        }
    }
}
