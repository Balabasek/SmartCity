public class Two {
    public static void two(String value) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] letters = value.toCharArray();

        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i) + "  ");
        }
        System.out.println();
        String temp = new String(letters);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                System.out.print("");
            } else {
                int j = alphabet.lastIndexOf(temp.toLowerCase().charAt(i));
                j += 1;
                if(j / 10 < 1) {
                    System.out.print(j + "  ");
                }else{
                    System.out.print(j + " ");
                }
            }
        }
    }
}
