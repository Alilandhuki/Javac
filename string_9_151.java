import java.util.Scanner;
public  class string_9_151{
    public static void main(String[] args) {
        Scanner ali = new Scanner(System.in);
        String word = ali.nextLine();
        char c1 ;
        String text = "";
        int l ;
        int max = 0;
        int a[] = new int [word.length()];
        for (int i = 0; i < word.length(); i++) {
            c1 = word.charAt(i);
            l = Character.digit(c1,10);
            if (l >= 0){
                a[i] = l;
                for (int j = 0; j < word.length(); j++) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
