//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileWriter;

public class Task5 {
    public static void main(String[] args) {


        testWrite();
    }
    public static StringBuilder testCreate(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST--".repeat(100));
        return sb;
    }
    public static void testWrite() {
        try {
            FileWriter text = new FileWriter("src/main/java/test.txt");
            text.write(String.valueOf(testCreate()));
            text.flush();
        } catch (Exception e) {
            System.out.println("FAIL");
        }
    }
}
