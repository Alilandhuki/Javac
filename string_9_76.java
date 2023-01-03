/*Дано предложение, в котором имеется несколько букв е. Найти:
а) порядковый номер первой из них;
б) порядковый номер последней из них*/
import java.util.Scanner;
public class string_9_76 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
            String str = ali.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e') {
                    System.out.print(i + " ");
                }
            }
    }
}
