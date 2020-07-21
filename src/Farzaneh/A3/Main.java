package Farzaneh.A3;

import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        public static void cat(File named) {
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
    }
}
