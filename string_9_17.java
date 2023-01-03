/*Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же
букву?
*/
import java.util.Scanner;
public class string_9_17 {
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String word = ali.next();
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
    }
}
