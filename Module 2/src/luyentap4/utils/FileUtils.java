package luyentap4.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String filepath){
        BufferedReader bufferedReader = null;
        List<String> strings = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                strings.add(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return strings;
    }
    public static void writeFile(String filepath, List<String> strings){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            for (String string : strings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
