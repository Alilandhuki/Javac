/*Дано слово. Вывести на экран его третий символ*/
import java.util.Scanner;
public class string_9_13 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String word = ali.next();
        System.out.println(word.charAt(2));
    }
}
