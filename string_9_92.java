/*Дано предложение. Все его символы, стоящие на четных местах, заменить
буквой ы*/
import java.util.Scanner;
public class string_9_92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char a ;
        for (int i = 0; i < word.length(); i++) {
            a = word.charAt(i);
            if (i % 2 == 0){
                a = 'y';
            }
            System.out.print(a);
        }
    }
}
