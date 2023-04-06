public class MatrixTranspoze {
    public static void main(String[] args) {
        int[][] matris = {{1, 2},
                {4, 5},
                {7, 8}};

        int[][] transposedMatris = new int[matris[0].length][matris.length];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transposedMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matrix ===");
        for(int[] row : matris) {
            for(int colum : row) {
                System.out.print(colum + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose ===");
        for (int[] row : transposedMatris) {
            for (int colum : row) {
                System.out.print(colum + " ");
            }
            System.out.println();
        }
    }

}
