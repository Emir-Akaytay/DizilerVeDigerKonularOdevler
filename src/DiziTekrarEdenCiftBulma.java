public class DiziTekrarEdenCiftBulma {
    static boolean isHave(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 8, 1, 5, 2, 9, 4, 3, 2, 6, 4};
        int[] duplicates = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    if (!isHave(duplicates, array[i]) && !isOdd(array[i])) {
                        duplicates[index++] = array[i];
                    }
                }
            }
        }

        for (int i : duplicates) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
