/*Дано слово из четного числа букв. Поменять местами его половины. Задачу
решить двумя способами:
1) без использования оператора цикла;
2) с использованием оператора цикла.
*/
import java.util.Scanner;
public class string_9_37 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String word = ali.next();
        if (word.length() % 2 == 0 ) {
            String w1 = word.substring(0, word.length() / 2);
            String w2 = word.substring(word.length() / 2, word.length());
            System.out.println(w2 + w1);
        }
        else {
            System.out.println("Not chetni");
        }
    }
}
