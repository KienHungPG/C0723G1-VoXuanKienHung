package FuramaResort.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> readFile(String pathname) {
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(pathname));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }
        public static void writeFile (String pathname, List < String > stringList){
            BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(pathname));
                for (String string : stringList) {
                    bufferedWriter.write(string);
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    if (bufferedWriter != null){
                        bufferedWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
