import java.util.Arrays;
public class DiziElemanFrekans {

    public static class Main {
        static int repeat(int[] arr, int value) {
            int howMany = 0;
            for (int i : arr) {
                if (i == value) {
                    howMany++;
                }
            }
            return howMany;
        }

        static boolean isRepeat(int[] arr, int value) {
            int howMany = 0;
            for (int i : arr) {
                if (i == value) {
                    howMany++;
                }
            }
            return howMany > 1;
        }

        public static void main(String[] args) {
            int[] array = {10, 20, 30, 10, 20, 30, 50, 50, 20};
            int[] repeats = new int[array.length];
            int startIndex = 0;

            for (int j : array) {
                if (isRepeat(array, j)) {
                    if (repeat(repeats, j) == 0) {
                        repeats[startIndex] = j;
                        startIndex++;
                    }
                }
            }

            System.out.println("Dizi : " + Arrays.toString(array));
            for (int i : repeats) {
                if (i != 0) {
                    System.out.println(i + " Sayısı " + repeat(array, i) + " Kere Tekrar Edildi ");
                }
            }
        }
    }
}
