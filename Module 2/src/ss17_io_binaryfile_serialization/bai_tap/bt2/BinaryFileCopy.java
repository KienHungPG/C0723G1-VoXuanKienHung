package ss17_io_binaryfile_serialization.bai_tap.bt2;

import java.io.*;
import java.util.Scanner;

public class BinaryFileCopy {
    public static void main(String[] args) {
        String sourceDirectoryPath = "E:\\CG\\Module 2\\src\\ss17_io_binaryfile_serialization\\bai_tap\\bt2";
        String sourceFileName = "File_Source.txt";
        String destinationDirectoryPath = "E:\\CG\\Module 2\\src\\ss17_io_binaryfile_serialization\\bai_tap\\bt2";
        String destinationFileName = "File_Result.txt";
        File sourceFile = new File(sourceDirectoryPath, sourceFileName);
        File destinationFile = new File(destinationDirectoryPath, destinationFileName);

        if (!sourceFile.exists()) {
            try {
                sourceFile.createNewFile();
                System.out.println("Source file created successfully.");
            } catch (IOException e) {
                System.out.println("Unable to create source file.");
                e.printStackTrace();
                return;
            }
        }
        if (!destinationFile.exists()) {
            try {
                destinationFile.createNewFile();
                System.out.println("Destination file created successfully.");
            } catch (IOException e) {
                System.out.println("Unable to create destination file.");
                e.printStackTrace();
                return;
            }
        }
        if (destinationFile.exists()) {
            System.out.println("The target file already exists. Do you want to overwrite? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("y")) {
                System.out.println("Cancel copying.");
                return;
            }
        }

        FileOutputStream sourceFileOutputStream = null;
        FileInputStream sourceFileInputStream = null;
        FileOutputStream destinationFileOutputStream = null;

        try {
            sourceFileOutputStream = new FileOutputStream(sourceFile, true);
            sourceFileInputStream = new FileInputStream(sourceFile);
            destinationFileOutputStream = new FileOutputStream(destinationFile);

            Scanner scanner = new Scanner(System.in);
            System.out.println("WRITE SOMETHING BRO!!!");
            String inputText = scanner.nextLine();
            byte[] inputBytes = inputText.getBytes();
            sourceFileOutputStream.write(inputBytes);
            sourceFileOutputStream.flush();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
                destinationFileOutputStream.write(buffer, 0, bytesRead);
            }

            long destinationFileSize = destinationFile.length();
            System.out.println("Number of bytes in the destination file: " + destinationFileSize + " byte");

            System.out.println("Copy file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sourceFileOutputStream != null) {
                    sourceFileOutputStream.close();
                }
                if (sourceFileInputStream != null) {
                    sourceFileInputStream.close();
                }
                if (destinationFileOutputStream != null) {
                    destinationFileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
