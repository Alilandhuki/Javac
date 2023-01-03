/*Дано предложение. Удалить из него все символы с n1-го по n2-й (n1 n2)*/
import java.util.Scanner;

public  class string_9_112{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String krk = word.substring(n1,n2);
        String newWord = "";
        if (n1 <= n2){
            for (int i = 0; i <= word.length(); i++) {
                newWord = word.replace(krk,"");
            }
            System.out.println(newWord);
        }
    }
}

// 9.44
// 9.144
// 11.142