//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
// (возвращает boolean значение).

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите текст: ");
        String text = scan.nextLine();
        scan.close();
        System.out.println(checkPolyndrom(text));
    }
    public static boolean checkPolyndrom(String text){
        String new_text = text.replace(" ", "");
        char[] chars = new_text.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length -1;
        while (left < right){
            if (chars[left] != chars[right]){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
         return true;
    }
}
