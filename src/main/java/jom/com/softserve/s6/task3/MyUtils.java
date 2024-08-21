package jom.com.softserve.s6.task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyUtils {

    public static void writeFile(String filename, String text) {
        StringBuilder binaryString = new StringBuilder();

        for (char c : text.toCharArray()) {
            String binaryChar = Integer.toBinaryString(c);
            String paddedBinaryChar = String.format("%7s", binaryChar).replace(' ', '0');
            binaryString.append(paddedBinaryChar);
        }

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(binaryString.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
