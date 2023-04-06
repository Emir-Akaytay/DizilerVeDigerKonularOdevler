import java.util.Arrays;
import java.util.Scanner;

public class DiziEnYakinSayilar {
    public static void main(String[] args) {
        int[] array = {54,55,52,61,34,82,90,12};
        int[] sortedArray = Arrays.copyOf(array,array.length);
        Arrays.sort(sortedArray);

        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı Giriniz : ");
        int a = input.nextInt();
        input.close();

        for(int i = 0; i < sortedArray.length ; i++ ) {
            if (a == sortedArray[i]) {
                System.out.println("Halihazırda Dizinin Elemanı Olan "+ a +" Sayısını Girdiniz !!!");
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+ sortedArray[i - 1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + sortedArray[i + 1]);
            }
            else if (sortedArray[i] < a && a < sortedArray[i + 1]) {
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+ sortedArray[i]);
                System.out.println("Girilen sayıdan büyük en yakın sayı : "+ sortedArray[i + 1]);
            }
            else if (sortedArray[sortedArray.length - 1] < a) {
                System.out.println("Dizideki En Büyük Elemandan Daha Büyük Bir Sayı Girdiniz !!!");
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+ sortedArray[sortedArray.length - 1]);
                break;
            }
        }
    }
}
