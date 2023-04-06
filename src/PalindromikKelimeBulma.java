import java.util.Scanner;

public class PalindromikKelimeBulma {

    public static boolean isPolindrom(String str) {
        int a = 0;
        int b = str.length() - 1;
        while (a < b) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public static boolean isPolindrom2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String word = input.nextLine();

        if (isPolindrom(word.toLowerCase())) {
            System.out.println(word + " Bir Polindrom Kelimedir !!!");
        } else {
            System.out.println(word + " Bir Polindrom Kelime Değildir !!!");
        }

        if (isPolindrom2(word)) {
            System.out.println(word + " Bir Polindrom Kelimedir !!!");
        } else {
            System.out.println(word + " Bir Polindrom Kelime Değildir !!!");
        }

    }
}

