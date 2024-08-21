package jom.com.softserve.s6.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

public class MyUtils {

    public static String readFile(String filename) {
        StringBuilder result = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(filename)) {
            byte[] bytes = fis.readAllBytes();
            String binaryString = new String(bytes);


            for (int i = 0; i < binaryString.length(); i += 7) {
                String sevenBitBinary = binaryString.substring(i, Math.min(i + 7, binaryString.length()));
                int charCode = Integer.parseInt(sevenBitBinary, 2);
                result.append((char) charCode);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}
