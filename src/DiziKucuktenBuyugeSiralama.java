import java.util.Scanner;
import java.util.Arrays;
public class DiziKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu ===> ");
        int a = input.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Dizinin "+(i + 1)+". Elemanını Giriniz ==> ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Elemanların Sıralanmış Hali ==> ");
        for(int i : array) {
            System.out.print(i +" ");
        }
    }
}
