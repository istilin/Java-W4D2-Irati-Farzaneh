package Irati.A4;

import java.io.*;

public class Cat {
    public static void cat(File named) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(named, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/irati/Documents/CodeFactory/Java/Week4/Day2/Exercises/Java-W4D2-Irati-Farzaneh/src/Irati/A4/test.txt");
        Cat cat1 = new Cat();
        cat1.cat(file);
    }
}
