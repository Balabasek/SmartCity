import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Task {
    public static void main(String[] args) {
        //-------------------------------------------1-----------------------------------
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            File file = new File(bufferedReader.readLine());
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            fr.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = list.size(); i < 0; i--){
            System.out.println(list.get(i));
        }
        //-------------------------------------------2-----------------------------------
        int num;
        Stack<Integer> stack = new Stack<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(reader.readLine());
            for (int i = 0; i < String.valueOf(num).length(); i++){
                stack.push(String.valueOf(num).charAt(i) - '0');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (!(stack.empty())){
            System.out.print(stack.pop());
        }
    }
}
