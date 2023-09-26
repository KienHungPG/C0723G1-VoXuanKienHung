package ss16_io_file_text.bai_tap.bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String csvFile = "E:\\CG\\Module 2\\src\\ss16_io_file_text\\bai_tap\\bai2\\data.csv";
        List<Country> countries = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int id = Integer.parseInt(data[0]);
                    String countryCode = data[1];
                    String countryName = data[2];
                    Country country = new Country(id, countryCode, countryName);
                    countries.add(country);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Country country : countries) {
            System.out.println("ID: " + country.getId() + ", Code: " + country.getCountryCode() + ", Name: " + country.getCountryName());
        }
    }
}
