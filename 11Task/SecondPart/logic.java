package SecondPart;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class logic {
    //-------------------------------------1---------------------------------
    public static void main(String[] args) {
//        FileReader fr = null;
//        FileWriter fw = null;
//        BufferedReader bufferedReader = null;
//        String subString = null;
//        String temp = "";
//        int length = 0;
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//
//            System.out.println("Введите путь к файлу для записи");
//            String outfileName = reader.readLine();
//            System.out.println(outfileName);
//            File outfile = new File(outfileName);
//            outfile.createNewFile();
//            fw = new FileWriter(outfile);
//            Random random = new Random();
//            for(int i = 0; i < 10; i ++){
//                fw.write(Integer.toString(random.nextInt(100)));
//                fw.write("\n");
//                fw.flush();
//            }
//
//            int[] array = new int[10];
//            fr = new FileReader(outfileName);
//            bufferedReader = new BufferedReader(fr);
//            for (int i = 0; i < 10; i++){
//                array[i] = Integer.parseInt(bufferedReader.readLine());
//            }
//
//            for (int i = 9; i > 0; i--){
//                for (int j = 0; j < i; j++){
//                    if(array[j] > array[j + 1]) {
//                        int tmp = array[j];
//                        array[j] = array[j + 1];
//                        array[j+1] = tmp;
//                    }
//                }
//            }
//            for(int i = 0; i < 10; i++){
//                System.out.println(array[i]);
//            }
//
//            PrintWriter writer = new PrintWriter(outfile);
//            writer.print(array[0]);
//            fw.write("\n");
//            writer.close();
//            for(int i = 1; i < 10; i ++){
//                fw.write(Integer.toString(array[i]));
//                fw.write("\n");
//                fw.flush();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fr.close();
//                bufferedReader.close();
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //-------------------------------------2---------------------------------

        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bufferedReader = null;
        String subString = null;
        String line;
        int length = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Введите путь к файлу для чтения");
            ArrayList<String> arrayList = new ArrayList<>();
            String fileName = reader.readLine();
            File infile = new File(fileName);
            fr = new FileReader(infile);
            bufferedReader = new BufferedReader(fr);
            line = bufferedReader.readLine();
            fw = new FileWriter(infile);
            while (line != null){
                arrayList.add(line);
                line = bufferedReader.readLine();
            }

            PrintWriter writer = new PrintWriter(infile);
            writer.print("");
            fw.write("\n");
            writer.close();

            for (String s:arrayList) {
                fw.write(s.replaceAll("public", "private"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
                bufferedReader.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
