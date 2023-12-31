package ss16_io_file_text.bai_tap.bai1;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String sourceDirectoryPath = "E:\\CG\\Module 2\\src\\ss16_io_file_text\\bai_tap\\bai1";
        String sourceFileName = "File_Source.txt";
        String destinationDirectoryPath = "E:\\CG\\Module 2\\src\\ss16_io_file_text\\bai_tap\\bai1";
        String destinationFileName = "File_Result.txt";
        File sourceFile = new File(sourceDirectoryPath, sourceFileName);
        File destinationFile = new File(destinationDirectoryPath, destinationFileName);
        if (destinationFile.exists()) {
            System.out.println("The target file already exists. Do you want to overwrite? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("y")) {
                System.out.println("Cancel copying.");
                return;
            }
        }

        BufferedWriter bufferedWriter = null;
        BufferedWriter bufferedWriter1 = null;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReaderDestination = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(sourceFile));
            bufferedWriter1 = new BufferedWriter(new FileWriter(destinationFile, true));
            bufferedReader = new BufferedReader(new FileReader(sourceFile));
            bufferedReaderDestination = new BufferedReader(new FileReader(destinationFile));

            Scanner scanner = new Scanner(System.in);
            System.out.println("WRITE SOMETHING BRO!!!");
            bufferedWriter.write(scanner.nextLine());
            bufferedWriter.flush();
            String line;
            int charCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter1.write(line);
                bufferedWriter1.newLine();
            }
            bufferedWriter1.flush();
            while ((line = bufferedReaderDestination.readLine()) != null) {
                charCount += line.length();
            }
            System.out.println("Number of characters in the file: " + charCount);
            System.out.println("Copy file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedWriter1 != null) {
                    bufferedWriter1.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedReaderDestination != null) {
                    bufferedReaderDestination.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
