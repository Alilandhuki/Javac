/* Дано предложение. Составить программу, которая выводит все вхождения
в предложение двух заданных символов*/
import java.util.Scanner;
public class string_9_55{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word = sc.next();
        String c1 = "a";
        int a=0 ;
        int b=0 ;
        int length = word.length();
        boolean res = word.startsWith(c1);
        //boolean res2 = word.endsWith(c1);
        System.out.println(c1);
    }
}
