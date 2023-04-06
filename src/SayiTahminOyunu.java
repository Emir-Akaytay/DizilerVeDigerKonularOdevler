import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int correct = rand.nextInt(100);
        int right = 5;
        int[] guess = new int[6];
        Scanner input = new Scanner(System.in);
        int startIndex = 0;
        boolean isFalseAgain = false;
        boolean isCorrect = false;

        System.out.println("0-100 Sayı Tahmin Oyununa Hoş Geldiniz !!! ");
        System.out.println("==========");

        while (right > 0) {
            System.out.print("Tahmininizi Giriniz : ");
            int number = input.nextInt();
            if (!(0 < number && number < 100)) {
                if (isFalseAgain) {
                    System.out.println("Lütfen 0-100 Arası Sayı Giriniz !!! ");
                    right--;
                } else {
                    System.out.println("Lütfen 0-100 Arası Bir Sayı Giriniz !!! \nUYARI : Sınırlar Dışı Bir Dahaki Sayı Girişiniz Haklarınızdan Düşürecektir !!!");
                    isFalseAgain = true;
                }
            } else if (correct == number) {
                System.out.println("Tahmininiz Doğru Tebrikler !!! ");
                isCorrect = true;
                guess[startIndex] = number;
                break;
            } else if (correct > number) {
                System.out.println("Tahmininiz Doğru Sayıdan Küçük !!!");
                right--;
            } else {
                System.out.println("Tahmininiz Doğru Sayıdan Büyük !!!");
                right--;
            }
            guess[startIndex++] = number;
            System.out.println("Kalan Haklar : " + right);
            System.out.println("===========");
        }

        if (!isCorrect) {
            System.out.println("Doğru Sayı : " + correct + " ");
            System.out.print("Tahminleriniz ===> ");
            for (int i : guess) {
                if (!(i == 0)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("Tahminleriniz ===> ");
            for (int i : guess) {
                if (!(i == 0)) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("\n==========");
    }
}
