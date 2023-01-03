/*Дано слово, состоящее из четного числа букв. Вывести на экран его первую
половину, не используя оператор цикла*/
import java.util.Scanner;
public class string_9_22 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String word = ali.next();
        int sub = word.length();
        if ( sub % 2 == 0) {
            String wq = word.substring(0, sub / 2);
            System.out.println(wq);
        }
        else {
            System.out.println("Not chetni");
        }
    }
}
