package firstPart;

import java.io.*;

public class logic {
    public static void main(String[] args) {
        //---------------------------------------------1-----------------------------------------------
//        FileReader fr = null;
//        FileWriter fw = null;
//        BufferedReader bufferedReader = null;
//        String subString = null;
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//
//            System.out.println("Введите путь к файлу для чтения");
//            String fileName = reader.readLine();
//            System.out.println(fileName);
//            File file = new File(fileName);
//
//            System.out.println("Введите путь к файлу для записи");
//            String outfileName = reader.readLine();
//            System.out.println(outfileName);
//            File outfile = new File(outfileName);
//            fw = new FileWriter(outfile);
//
//            System.out.println("ВВедите подстроку, которую хотите удалить");
//            subString = reader.readLine();
//
//            fr = new FileReader(file);
//            bufferedReader = new BufferedReader(fr);
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//
//                fw.write(line.replaceAll(subString, "") + "\n");
//                fw.flush();
//                line = bufferedReader.readLine();
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
        //--------------------------------------------2-----------------------------

        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader bufferedReader = null;
        String subString = null;
        String temp = "";
        int length = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Введите путь к файлу для чтения");
            String fileName = reader.readLine();
            System.out.println(fileName);
            File file = new File(fileName);

            System.out.println("Введите путь к файлу для записи");
            String outfileName = reader.readLine();
            System.out.println(outfileName);
            File outfile = new File(outfileName);
            fw = new FileWriter(outfile);

            System.out.println("ВВедите подстроку, которую хотите удалить");
            subString = reader.readLine();
            length = subString.length();
            for(int i = 0; i < length; i++){
                temp = temp + "s";
            }

            fr = new FileReader(file);
            bufferedReader = new BufferedReader(fr);
            String line = bufferedReader.readLine();

            while (line != null) {

                fw.write(line.replaceAll(subString, temp) + "\n");
                fw.flush();
                line = bufferedReader.readLine();
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
