/*Дан текст. Определить, сколько в нем предложений*/
import java.util.Scanner;
public class string_9_69 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String s = ali.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println(count);
    }
}
